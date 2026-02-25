extends Node2D

var baseMachine: StateMachine

# Called when the node enters the scene tree for the first time.
func _ready() -> void:
	baseMachine = StateMachine.new()
	baseMachine\
		.AddState("Patrol", Patrol.new())\
		.AddState("Idle", Idle.new())\
		.AddTransition("Patrol", "Idle", Callable(self, "HelloIdle"))\
		.AddTransition("Idle", "Patrol", Callable(self, "Hello"))\
		.SetStart("Idle")
	
	
	
	baseMachine.Entry()


# Called every frame. 'delta' is the elapsed time since the previous frame.
func _process(delta: float) -> void:
	baseMachine.Maintain()
	

func Hello() -> bool:
	print("Hello Patrol")
	return true


func HelloIdle()->bool:
	print("Hello Idle")
	return true
