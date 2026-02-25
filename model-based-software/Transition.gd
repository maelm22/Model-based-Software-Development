extends Node
class_name Transition

var Origin:State
var Destination:State

var Condition:Callable

func _init(origin: State, destination:State, condition: Callable) -> void:
	Origin = origin
	Destination = destination
	Condition = condition
