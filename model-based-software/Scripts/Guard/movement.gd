extends Node

@onready var guard: CharacterBody2D = $".."

var speed:int = 50
var player: CharacterBody2D = null

# Called when the node enters the scene tree for the first time.
func _ready() -> void:
	var players = get_tree().get_nodes_in_group("Player")

	if players.size() > 0:
		player= players[0]
		print(player.name)
		print(player.global_position)


# Called every frame. 'delta' is the elapsed time since the previous frame.
func _process(delta: float) -> void:
	move_to(player.global_position)


func move_to(point_to_move_to):
	guard.velocity = guard.position.direction_to(point_to_move_to) * speed
	if guard.position.distance_to(point_to_move_to) > 10:
		guard.move_and_slide()
	
