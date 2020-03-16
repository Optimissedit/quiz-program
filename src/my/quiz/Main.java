package my.quiz;

class Main {

	public static void main(String[] args) {
		// Example question 1
		Question q = new Question("What is 3 + 3?", "6");
		q.addDummy("9"); q.addDummy("5"); q.addDummy("12");
		
		// Example question 2
		Question q1 = new Question("How many hours in a day?", "24");
		q1.addDummy("365"); q1.addDummy("23"); q1.addDummy("12");
		
		// Example quiz
		Quiz qu = new Quiz();
		
		qu.addQuestion(q);
		qu.addQuestion(q1);
		
		// Quiz functions
		
		qu.display();
		
		qu.nextQuestion();
		
		qu.prevQuestion();
		
		// Out of range request, handled
		qu.prevQuestion();
		
		qu.nextQuestion();
		
		// Out of range request, handled
		qu.nextQuestion();
		

	}

}
