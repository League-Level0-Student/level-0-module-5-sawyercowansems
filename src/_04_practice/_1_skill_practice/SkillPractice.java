package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {

SkillPractice skills = new SkillPractice();
           skills.skill1();
           skills.skill2();
           skills.skill3();
           skills.skill4();
           skills.skill5();
}

void skill1() {
// Use pop-ups for the following.
// Ask the user how many dimes they have
 String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
 int pennys = Integer.parseInt(dimes);
// Tell them how many cents they have (hint multiply by 10)
pennys = pennys * 10;
JOptionPane.showMessageDialog(null, "You have " + pennys + " pennies.");
// Ask the user how tall they are (inches)
String inch = JOptionPane.showInputDialog("How tall are you in inches?");
int inches = Integer.parseInt(inch);
// If they are shorter than 36 inches, tell them to eat their Wheaties
if(inches < 36) {
	JOptionPane.showMessageDialog(null, "Eat your Weaties.");
}
}

void skill2() { // Write a loop to print every third number between 1 and 30 to the console
for (int i = 1; i < 31; i++) {
	if(i % 3 == 0) {
	System.out.println(i);
	}
	}
}

void skill3() { // Get a random number that is less than 20 and print it to the console
int uou = 0;
Random in = new Random();
int integre = in.nextInt(20);
System.out.println(integre);
// Get another random number that is less than 10 and print it to the console
Random out = new Random();
int inte = out.nextInt(10);
System.out.println(inte);
// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction
uou = integre - inte;
System.out.println(uou);
}
void skill4() { // In a pop-up, ask the user for the city they live in
String joe = JOptionPane.showInputDialog("Which city do yu live in?");
// If they answered "San Diego", tell them they live in America's Finest City
if(joe.equals("San Diego")) {
	JOptionPane.showMessageDialog(null, "You live in americas finest city.");
}
else {
	JOptionPane.showMessageDialog(null, "You should move to San Diego");
}
// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation."
int cars = 2;
if(cars == 0) {
	JOptionPane.showMessageDialog(null, "I bet you use public transportation.");
}
// If there is 1 car, use a pop-up to display the make/model of the car
if(cars == 1) {
	JOptionPane.showMessageDialog(null, "Tesla");
}
if(cars == 2) {
	JOptionPane.showMessageDialog(null, "Together they have 8 legs");
}
}

void skill5() { // In a pop-up, ask the user for the name of their school
String skhoool = JOptionPane.showInputDialog("What school do you go to?");
// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message.
JOptionPane.showMessageDialog(null, "Wow! " + skhoool + " is an amazing school.");


}
}