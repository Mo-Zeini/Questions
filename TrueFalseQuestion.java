package Questions;
import javax.swing.*;

public class TrueFalseQuestion extends Question {
	
	// True or False constructor.
	public TrueFalseQuestion(String question, String answer) {
		super(question); // Call the Question Constructor in the Question class.
		
		JPanel buttons = new JPanel(); // Create a panel to arrange the button.
		addButton(buttons,"TRUE"); // Add a button labeled TRUE.
		addButton(buttons,"FALSE"); // Add a button labeled FALSE.
		this.question.add(buttons); // Add the "buttons" panel to the dialog box itself.
		
		initQuestionDialog(); // Call the initQuestionDialog method to finish the initialization of the "question" instance variable.
		
		correctAnswer = answer;
		correctAnswer = correctAnswer.toUpperCase(); // Convert the correctAnswer String to upper case.
	} // End of the TrueFalseQuestion constructor.
	
	// The "addButton" method to create buttons.
	void addButton(JPanel buttons, String label) {
		JButton button = new JButton(label); // Create a new button with the provided label.
		button.addActionListener(question); // Wire the button into the "actionPerformed" method of the "question" object, so it will record the answer if the button is clicked.
		buttons.add(button); // Add the button to the "buttons" panel.
	} // End of the "addButton" method.
} // end of inherited class TrueFalseQuestion
