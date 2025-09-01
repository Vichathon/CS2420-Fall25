package assign02;

import java.util.ArrayList;

public class CS2420Student extends UofUStudent{
	EmailAddress contactInfo;
	ArrayList<Double> assignments, exams, labs, quizzes, polling;
	
	public CS2420Student(String firstName, String lastName, int uNID, EmailAddress contactInfo) {
		super(firstName,lastName,uNID);
		
	}
	
	public EmailAddress getContactInfo(){
		return contactInfo;
	}	
	
	public void addScore(double score, String category) {
		switch (category) {
			case "assignment":
				assignments.add(score);
				break;
			case "exam":
				exams.add(score);
				break;	
			case "lab":
				labs.add(score);
				break;	
			case "quiz":
				quizzes.add(score);
				break;	
			case "poll":
				polling.add(score);
				break;	
		}
			
			
	}
	
	public double computeFinalScore() {
		double totalScore = 0; 
		for (int scores = 0; scores < assignments.size(); scores++) { 
			assignments.get(scores);
		}
	}
	
	public String computeFinalGrade() {
		
		return null;
		
	}
}
