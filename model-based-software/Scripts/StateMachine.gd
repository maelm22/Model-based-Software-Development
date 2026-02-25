extends State
class_name StateMachine

var StartState:state
var CurrentState:state
var NextState:state
var States:Dictionary[String, State]
var Transitions:Dictionary[String, Transition]

func Entry():
	CurrentState = StartState

func Maintain():
	CurrentState.Maintain()
	
	if Transitions.get(CurrentState.Name).Condition.call():
		NextState = Transitions.get(CurrentState.Name).Destination
		CurrentState.Exit()
		CurrentState = NextState
		CurrentState.Entry()
	

func Exit():
	CurrentState.Exit()
	

func AddState(name: String, state:State):
	States.get_or_add(name, state)
	return self

func AddTransition(from: String, to: String, condition:Callable):
	Transitions.get_or_add(from, transition.new(States.get(from), States.get(to), condition))
	return self 
