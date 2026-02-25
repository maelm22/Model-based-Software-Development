extends State
class_name Pursuit

var pursuit_target: CharacterBody2D = null
var guard: CharacterBody2D = null
var speed = 150


func Entry():
	guard = get_tree().get_root().find_node("Guard")[0]
	pursuit_target = get_tree().get_root().find_node("Player")[0]
	

func Maintain():
	pursuit(pursuit_target.position)
	
func Exit():
	pass

func pursuit(point_to_move_to):
	guard.velocity = guard.position.direction_to(point_to_move_to) * speed
	if guard.position.distance_to(point_to_move_to) > 10:
		guard.move_and_slide()
