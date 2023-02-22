package Questions;
import java.awt.*;
import javax.swing.*;

public abstract class Question {
	
	static int nQuestions = 0; // Declare and initialize the static member variable for the number of questions.
	static int nCorrect = 0; // Declare and initialize the static member variable for the number of correct answers.
	
	QuestionDialog question;  // Declare QuestionDialog variable.
	String correctAnswer;   // Declare instance variable correct answer.
	
	
	Question(String question) {
		this.question = new QuestionDialog();
		this.question.setLayout(new GridLayout(0,1));
		this.question.add(new JLabel(" "+question+" ",JLabel.CENTER));
		
	}
	
	
	// the instance method check.
		void check() {
			// Call the ask function and assign its return value to the local variable answer.
			String answer = ask(); 
			
			// Show Message the answer is correct.
			if (answer.equals(correctAnswer)) { 
				JOptionPane.showMessageDialog(null, answer+" is the correct answer. Congratulations.");
				
				// increment the static member variable nCorrect for the number of correct answers.
				nCorrect++;
			} // end of if statement.
			
			else {
				// Show Message the answer is incorrect.
				JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + correctAnswer);
			} // end of else statement.
			
			// increment the static member variable nQuestions for the number of questions.
			nQuestions++;
			
		} // end of check method.
		
		// The class method showResults.
		static void showResults() {
			// Show the number the number of the correct answers and the total number of questions.
			JOptionPane.showMessageDialog(null, nCorrect+" correct out of " +nQuestions+ " questions");
		} // end of class method showResults.
		
		
		// This instance method initQuestionDialog is to to finish the initialization of the "question" instance variable.
		void initQuestionDialog() {
			this.question.setModal(true); // Call the setModal method to indicate that the dialog is modal.
			this.question.pack(); // call the pack() method to size the frame.
			this.question.setLocationRelativeTo(null); // Call the setLocationRelativeTo method to set the location of the window relative to the specified component.
		}
		
		// the instance method ask.
		String ask() {
			question.setVisible(true); // Call the setVisible method to make the frame appear on the screen.
			return question.answer;	// return the command string stored in the variable string in the the actionPerformed method in the ActionListener interface.
			} // end of method ask.

} // end of class Question
