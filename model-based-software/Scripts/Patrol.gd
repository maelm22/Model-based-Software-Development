extends State
class_name Patrol

var start_point: Vector2
var patrol_points: Array[Vector2] = [Vector2(1000,100), Vector2(1000, 550), Vector2(130,550), Vector2(130, 100)]
var speed = 50
var guard: CharacterBody2D = null
var current_destanation_index = 0
var current_destanation: Vector2

func Entry():
	guard = get_tree().get_nodes_in_group("Guard")[0]
	current_destanation = patrol_points[current_destanation_index]

func Maintain():
	patrol()
	
func Exit():
	pass

func patrol():
	if guard.global_position.distance_to(current_destanation) < 20:
		new_destanation()
	move_to(current_destanation)

func move_to(point_to_move_to):
	guard.velocity = guard.position.direction_to(point_to_move_to) * speed
	if guard.position.distance_to(point_to_move_to) > 10:
		guard.move_and_slide()

func new_destanation():
	current_destanation_index+=1
	if patrol_points.size() < current_destanation_index:
		current_destanation_index = 0
	
	current_destanation = patrol_points[current_destanation_index]
