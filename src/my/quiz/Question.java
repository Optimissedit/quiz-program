package my.quiz;

import java.awt.List;
import java.util.Arrays;
import java.util.Collections;

public class Question {
	
	private String content;
	private String answer;
	private String dummies[];
	
	// Default constructor, creates a question with 4 possible answers.
	public Question(String title, String ans) {
		content = title;
		answer = ans;
		dummies = new String[3];
	}
	
	// Constructor allowing dummy answers to be copied from a list
	public Question(String title, String ans, String dumm[]) {
		content = title;
		answer = ans;
		dummies = dumm;
	}
	
	// Constructor allowing any size dummy list, for especially hard questions
	public Question(String title, String ans, int size) {
		content = title;
		answer = ans;
		dummies = new String[size];
	}
	
	/**
	 * Getter for content of the question
	 * @return content
	 */
	public String getContent() {
		return content;
	}
	
	/**
	 * Getter for answer of the question 
	 * @return answer
	 */
	public String getAnswer() {
		return answer;
	}
	
	/**
	 * Sets the value to input at desired index in dummies list
	 * @param in input to replace current value
	 * @param index index to replace value at
	 */
	public void addDummy(String in, int index) {
		dummies[index] = in;
	}
	
	/**
	 * 
	 * @return
	 */
	public String[] getListRaw() {
		String[] result = new String[dummies.length + 1];
		for(int i = 0; i < dummies.length; i++) {
			result[i] = dummies[i];
		}
		result[result.length - 1] = answer;

		return result;
	}
	//TODO: Shuffle list here? Or when passed to quiz?
}
