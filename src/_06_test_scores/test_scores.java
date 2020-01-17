package _06_test_scores;

import javax.swing.JOptionPane;

public class test_scores {
public static void main(String[] args) {
	String scores = JOptionPane.showInputDialog("what score did you get on your test?");
	double testscores = Double.parseDouble(scores);
  double test = 70.5;
	if (testscores < test ) {
		JOptionPane.showMessageDialog(null, "I hope you do better on the next one!");
	}
	if (testscores > test) {
		JOptionPane.showMessageDialog(null, "good job!");
	}
}
}
