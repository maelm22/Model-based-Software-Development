extends Node

var baseMachine: StateMachine

# Called when the node enters the scene tree for the first time.
func _ready() -> void:
	baseMachine.new()\
	.AddState("Guard", StateMachine.new()\
		.AddState("Patrol", Patrol.new())\
		.AddState("Idle", Idle.new())
	\
	)


# Called every frame. 'delta' is the elapsed time since the previous frame.
func _process(delta: float) -> void:
	baseMachine.Maintain()
