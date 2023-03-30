package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String x = JOptionPane.showInputDialog("What is greater than God,\n"
				+ "more evil than the devil,\n"
				+ "the poor have it,\n"
				+ "the rich need it,\n"
				+ "and if you eat it, you'll die?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (x.equals("Nothing") || x.equals("nothing")) {
			JOptionPane.showMessageDialog(null,"Correct!");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null,"Wrong, the answer was: Nothing");
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		String b = JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
		// 6. Add some more riddles
		if (b.equals("A stamp") || b.equals("stamp")) {
			JOptionPane.showMessageDialog(null,"Correct!");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null,"Wrong, the answer was: A stamp");
		}
		String a = JOptionPane.showInputDialog("Who makes it, has no need of it.\n"
				+ "Who buys it, has no use for it.\n"
				+ "Who uses it can neither see nor feel it.\n"
				+ "What is it?");
		// 6. Add some more riddles
		if (a.equals("A coffin") || a.equals("coffin")) {
			JOptionPane.showMessageDialog(null,"Correct!");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null,"Wrong, the answer was: A coffin");
		}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null,"Your score was: " + score);
	}
}

