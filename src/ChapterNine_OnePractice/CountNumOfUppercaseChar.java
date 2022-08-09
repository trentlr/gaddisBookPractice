package ChapterNine_OnePractice;

import java.io.*;
import javax.swing.JOptionPane;

public class CountNumOfUppercaseChar {
	
	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog(null, "Type some input: ");
		checkForUppercase(str);
	}
	
	private static void checkForUppercase(String input) {
		int numOfUppercase = 0;
		for (int i = 0; i < input.length(); i++) {
			if (Character.isLetter(input.charAt(i))) {
				if (input.toUpperCase().charAt(i) == input.charAt(i)) {
					numOfUppercase++;
				}
			}
		}
		JOptionPane.showMessageDialog(null, numOfUppercase);
	}
}
