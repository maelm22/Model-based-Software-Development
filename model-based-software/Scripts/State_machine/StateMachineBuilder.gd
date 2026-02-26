extends Node
class_name StateMachineBuilder

var baseMachine: StateMachine = StateMachine.new()

func AddState(StateName: String, state:State):
	baseMachine.AddState(StateName, state)
	return self

func AddTransition(from: String, to: String, condition:Callable):
	baseMachine.AddTransition(from, to, condition)
	return self 

func SetStart(startState: String):
	baseMachine.SetStart(startState)
	return self

func Build():
	add_child(baseMachine)
	baseMachine.Build()
