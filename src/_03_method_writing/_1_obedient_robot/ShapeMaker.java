package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ShapeMaker{
static Robot rick = new Robot();
public static void main(String[] args) {
	rick.setSpeed(100);
	int task = JOptionPane.showOptionDialog(null, "Pick a shape.", "Shapes", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Square", "Triangle", "Circle"}, null);
	if(task == 0) {
		square();
	}
	if(task == 1) {
		triangle();
	}
	if(task == 2) {
		circle();
	}
	rick.hide();
	}
public static void square() {
	for (int i = 0; i < 4; i++) {
		rick.penDown();
		rick.move(100);
		rick.turn(90);
	}
}
public static void triangle() {
	for (int i = 0; i < 3; i++) {
		rick.penDown();
		rick.move(135);
		rick.turn(120);
	}
}
public static void circle() {
	for (int i = 0; i < 360; i++) {
		rick.penDown();
		rick.move(2);
		rick.turn(1);
	}
}
}
