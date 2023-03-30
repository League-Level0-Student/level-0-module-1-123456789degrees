package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String lucas = "good at math.";
		String patrick = "smart.";
		String peter = "good at swimming.";
		String sion = "funny.";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String x = JOptionPane.showInputDialog("Enter a person's name: ");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
		if (x.equals("Lucas")) {
			JOptionPane.showMessageDialog(null,"Lucas is " + lucas);
		}
		else if (x.equals("Patrick")) {
			JOptionPane.showMessageDialog(null,"Patrick is " + patrick);
		}
		else if (x.equals("Peter")) {
			JOptionPane.showMessageDialog(null,"Peter is " + peter);
		}
		else if  (x.equals("Sion")){
			JOptionPane.showMessageDialog(null,"Sion is " + sion);
		}
		else {
			JOptionPane.showMessageDialog(null,"NOT A VALID NAME ERROR 300");
		}
	}
}

