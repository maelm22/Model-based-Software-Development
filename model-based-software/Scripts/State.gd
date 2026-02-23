extends Node


@abstract
class state:

	var Name:String

	@abstract
	func Entry()


	@abstract
	func Maintain()


	@abstract
	func Exit()
	

class Transition:
	var Origin:state
	var Destination:state
	
	var Condition:Callable
	
	func _init(origin: state, destination:state, condition: Callable) -> void:
		Origin = origin
		Destination = destination
		Condition = condition
		
	

class StateMachine extends state:
	var StartState:state
	var CurrentState:state
	var NextState:state
	var States:Dictionary[String, state]
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
		
	
	func AddState(name: String, State:state) -> state:
		States.get_or_add(name, State)
		return self

	func AddTransition(from: String, to: String, condition:Callable):
		Transitions.get_or_add(from, Transition.new(States.get(from), States.get(to), condition))
		return self
