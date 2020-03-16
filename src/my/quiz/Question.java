package my.quiz;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Question {
	
	private String content;
	private String answer;
	private ArrayList<String> dummies;
	
	// Default constructor, creates a question
	public Question(String title, String ans) {
		content = title;
		answer = ans;
		dummies = new ArrayList<String>();
	}
	
	// Constructor allowing dummy answers to be copied from another list
	public Question(String title, String ans, ArrayList<String> dumm) {
		content = title;
		answer = ans;
		dummies = dumm;
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
	public void addDummy(String in) {
		dummies.add(in);
	}
	
	/**
	 * Method to return a list of the answer mixed with dummies in a shuffled order
	 * @return shuffled list of possible answers
	 */
	public ArrayList<String> getListRaw() {
		
		ArrayList<String> result = new ArrayList<String>();
		
		for(int i = 0; i < dummies.size(); i++) {
			result.add(i, dummies.get(i));
		}
		result.add(answer);
		
		Collections.shuffle(result);

		return result;
	}
	
	@Override
	public String toString() {
		String result = content + "\n";
		ArrayList<String> list = getListRaw();
		
		for(int i = 0; i < list.size(); i++) {
			result += ("[" + (i + 1) + "] " + list.get(i) + "\n");
		}
		
		return result;
	}
}
