extends CharacterBody2D

var player_vision = false

func _process(delta: float) -> void:
	print_debug(player_vision)
	pass




func _on_line_of_sight_sees_not() -> void:
	player_vision = false


func _on_line_of_sight_sees_player() -> void:
	player_vision = true
