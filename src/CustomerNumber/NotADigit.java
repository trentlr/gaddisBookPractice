package CustomerNumber;

import javax.swing.JOptionPane;

public class NotADigit {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Please enter a character: ");
		char ch = input.charAt(0);
		
		if (Character.isDigit(ch)) {
			JOptionPane.showMessageDialog(null, "digit");
		} else {
			JOptionPane.showMessageDialog(null, "Not a digit.");
		}
	}
}
