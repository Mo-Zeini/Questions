package Questions;
import java.awt.*;
import javax.swing.*;

public class MultipleChoiceQuestion extends Question {

	// MultipleChoiceQuestion Constructor.
	public MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
		super(query); // Call the Question Constructor in the Question class.

		// Call the addChoice method to add buttons and their names.
		addChoice("A",a);
		addChoice("B",b);
		addChoice("C",c);
		addChoice("D",d);
		addChoice("E",e);

		initQuestionDialog(); // Call the initQuestionDialog method to finish the initialization of the "question" instance variable.

		correctAnswer = answer;
		correctAnswer = correctAnswer.toUpperCase(); // Convert the correctAnswer String to upper case.	
	} // End of the MultipleChoiceQuestion Constructor.

	// The addChoice method creates a button and defines its layout.
	void addChoice(String name, String label) {
		JPanel choice = new JPanel(new BorderLayout()); // Create a panel to arrange the button.
		JButton button = new JButton(name); // Create a button with the given name.
		button.addActionListener(question); // Wire the button into the "actionPerformed" method of the "question" object, so it will record the answer if the button is clicked.
		choice.add(button,BorderLayout.WEST); // Add the button to the "choice" panel, aligned to the west of the panel.
		choice.add(new JLabel(label+" ",JLabel.LEFT),BorderLayout.CENTER);
		question.add(choice); // Add the panel holding the button to the dialog box.
	} // End of the addChoice method.
} // end of class MultipleChoiceQuestion.
