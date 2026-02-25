extends Node2D

var baseMachine: StateMachine

@onready
var Guard = $".."

# Called when the node enters the scene tree for the first time.
func _ready() -> void:
	baseMachine = StateMachine.new()
	add_child(baseMachine)
	
	baseMachine\
	.AddState("Guard", StateMachine.new()\
		.AddState("Patrol", Patrol.new())\
		.AddState("Idle", Idle.new())\
		.AddState("Pursuit", Pursuit.new())\
		.AddTransition("Patrol", "Pursuit", Callable(self, "HelloRun"))\
		.AddTransition("Idle", "Patrol", Callable(self, "HelloPatrol"))\
		.AddTransition("Pursuit", "Patrol", Callable(self, "HelloPatrol"))
		.SetStart("Idle")
		)\
		.SetStart("Guard")
	
	
	baseMachine.Build()
	
	baseMachine.Entry()


# Called every frame. 'delta' is the elapsed time since the previous frame.
func _process(delta: float) -> void:
	baseMachine.Maintain()
	

func HelloPatrol() -> bool:
	print("Hello Patrol")
	return !Guard.player_vision


func HelloIdle()->bool:
	print("Hello Idle")
	return true
	

func HelloRun()->bool:
	print("Hello Run")
	return Guard.player_vision
