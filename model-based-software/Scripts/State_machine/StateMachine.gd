extends State
class_name StateMachine

var StartState:State
var CurrentState:State
var NextState:State
var States:Dictionary[String, State]  = {}
var Transitions:Dictionary[String, Array]  = {}

func Entry():
	CurrentState = StartState
	CurrentState.Entry()

func Maintain():
	CurrentState.Maintain()
	if Transitions.has(CurrentState.Name):
		for transition in Transitions.get(CurrentState.Name):
			if transition.Condition.call():
				NextState = transition.Destination
				CurrentState.Exit()
				CurrentState = NextState
				CurrentState.Entry()
	

func Exit():
	CurrentState.Exit()
	

func AddState(StateName: String, state:State):
	print(state)
	state.Name = StateName
	States.get_or_add(StateName, state)
	
	return self

func AddTransition(from: String, to: String, condition: Callable):
	if States.has(from) and States.has(to):
		if Transitions.has(from):
			Transitions.get(from).append(Transition.new(States.get(from), States.get(to), condition))
		else:
			Transitions.get_or_add(
				from, [Transition.new(States.get(from), States.get(to), condition)]
			)
	return self


func SetStart(startState: String):
	if States.has(startState):
		StartState = States.get(startState)
		#print(StartState)
	return self

func Build():
	for state in States.keys():
		add_child(States.get(state))
		if States.get(state) is StateMachine:
			States.get(state).Build()
	
