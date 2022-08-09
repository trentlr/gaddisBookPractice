package ChapterNine_OnePractice;

import javax.swing.JOptionPane;

public class LoopTilQuit {
	public static void main(String[] args) {
		char option = loopOption();
		while(option != 'Q') {
			option = loopOption();
		}
	}
	private static char loopOption() {
		String input = JOptionPane.showInputDialog("Type R to repeat, or Q to quit: ").toUpperCase();
		char ch = input.charAt(0);
		checkChoice(ch);
		return ch;
	}
	private static char checkChoice(char choice) {
		char ch = choice;
		if (choice != 'Q') {
			if (choice != 'R') {
				JOptionPane.showMessageDialog(null, "Choice must be Q or R.");
				ch = loopOption();
			}
		}
		return ch;
	}
}
