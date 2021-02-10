import javax.swing.JOptionPane;

public class Quiz {

	public static void main(String[] args) {
		String question = "What is your favourite programming language?\n";
		question += "A. Java.\n";
		question += "B. JavaScript.\n";
		question += "C. Python.\n";
		question += "D. NodeJS.\n";
		question += "E. Kotlin.\n";

		/**
			* Check if the answer is among the choices,
			* If yes, check if the answer is correct,
				* If correct, say "Correct" and break out of the iteration,
				* If not correct, throw the "Incorrect..." error message and ask the user to try again,
			If no, throw the "Invalid..." error message and ask the user to try again, until a correct answer is given.
		 */
		
		do {
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();

			if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")) {
				if (answer.equals("A")) {
					JOptionPane.showMessageDialog(null, "Correct!");
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Incorrect. Please try again");
					continue;
				}
			} else {
				JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D, or E.");
				continue;
			}
			
		}
		while (true);
	}

}

