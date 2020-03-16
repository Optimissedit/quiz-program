package my.quiz;

import java.util.ArrayList;
import java.util.Collections;

public class Quiz {
	
	// List of all questions in quiz
	private ArrayList<Question> questions;
	// List of correctly answered questions for later analysis
	private ArrayList<Question> correctAnswer;
	// Iterator to hold current place in quiz
	private int currQuestion = 0;
	
	// Constructor
	public Quiz() {
		questions = new ArrayList<Question>();
		correctAnswer = new ArrayList<Question>();
	}
	
	/**
	 * Adder method to append new questions to quiz
	 * @param q new question
	 */
	public void addQuestion(Question q) {
		questions.add(q);
	}
	
	// TODO
	public Question removeQuestion(Question q) {
		return q;
		// Todo: add compareTo for Question, finish this method
		// Index version of this method too?
	}
	
	/**
	 * Mixes up the order of questions in arraylist randomly
	 */
	public void shuffleQuiz() {
		Collections.shuffle(questions);
	}
	
	/**
	 * Formats the question and prints it to console in a readable way
	 */
	public void display() {
		System.out.println("Question Number " + (currQuestion + 1) + "\n" + questions.get(currQuestion).toString());
	}
	
	/**
	 * Method to change the current question being displayed with the next one following it
	 */
	public void nextQuestion() {
		// Check to not break range, prints message if at end of list
		if (currQuestion < questions.size() - 1) {
			currQuestion++;
		}
		else {
			System.out.println("No next question available.");
		}
		// Display new question
		display();
	}
	
	/**
	 * Method to change the question being displayed with the one immediately preceeding it
	 */
	public void prevQuestion() {
		// Check to not break range, print message if at beginning of list
		if(currQuestion > 0) {
			currQuestion--;
		}
		else {
			System.out.println("No previous question available.");
		}
		// Display new question
		display();
	}
	
}
