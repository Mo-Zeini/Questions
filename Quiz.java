package Questions;

/*
 * This application asks multiple-choice questions and true or false questions
 * using Swing GUI Java. 
 * It also shows correct and incorrect answers and presents, in the end, how many correct answers a user can get.
 */

public class Quiz {

	public static void main(String[] args) {
		
		// The first True or False question object.
		Question question6 = new TrueFalseQuestion("Earth is the third planet from the sun.", "True");
		question6.check();
		
		// The second True or False question object.
		Question question7 = new TrueFalseQuestion("World war 2 was ended in 1939.", "False");
		question7.check();
		
		// The third True or False question object.
		Question question8 = new TrueFalseQuestion("Grand Central Terminal, Park Avenue, New York is the world's largest railway station.", "True");
		question8.check();
		
		// The fourth True or False question object.
		Question question9 = new TrueFalseQuestion("The Colosseum in Rome is one of the Seven Wonders of the World.", "True");
		question9.check();
		
		// The fifth True or False question object.
		Question question10 = new TrueFalseQuestion("The capital city of Canada is Toronto.", "False");
		question10.check();
	
		// The first multiple-choice question object.
		Question question1 = new MultipleChoiceQuestion(
				"What is the fifth planet from the sun called?", 
				"Mars", 
				"Earth", 
				"Mercury", 
				"Jupiter", 
				"Uranus", 
				"d");
		question1.check(); // Call the check method with the first question.
		
		// The second multiple-choice question object.
		Question question2 = new MultipleChoiceQuestion(
				"What is the biggest animal on the planet called?", 
				"Lion", 
				"Blue Whale", 
				"Elephant", 
				"Giraffe", 
				"Beluga Whale", 
				"b");
		question2.check(); // Call the check method with the second question.
		
		
		// The third multiple-choice question object.
		Question question3 = new MultipleChoiceQuestion(
				"What is the tallest building in the world?", 
				"Central Park Tower", 
				"International Commerce Centre", 
				"Lotte World Tower", 
				"Shanghai Tower", 
				"Burj Khalifa", 
				"e");
		question3.check(); // Call the check method with the third question.
		
		
		// The fourth multiple-choice question object.
		Question question4 = new MultipleChoiceQuestion(
				"Where is the leaning tower of Pisa located?", 
				"Italy", 
				"France", 
				"England", 
				"Egypt", 
				"India", 
				"a");
		question4.check(); // Call the check method with the fourth question.
		
		
		// The fifth multiple-choice question object.
		Question question5 = new MultipleChoiceQuestion(
				"How many players are there in a basketball team?", 
				"Seven", 
				"Four", 
				"Five", 
				"Eight", 
				"Nine", 
				"c");
		question5.check(); // Call the check method with the fifth question.
				
		// Call the method showResults to show the final results.
		Question.showResults();
		
	} // end of main()
	
} // end of class Quiz
