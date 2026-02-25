extends ShapeCast2D

signal sees_player

signal sees_not

func _process(delta: float) -> void:
	for col in max_results:
		if get_collider(col) != null:
			if get_collider(col).get("name") == "Player":
				sees_player.emit()
				#print_debug("yes")
			if get_collider(col).get("name") != "Player":
				sees_not.emit()
		else:
			sees_not.emit()
