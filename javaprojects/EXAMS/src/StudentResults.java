


//STUDENT GENERAL DESCRIPTIONS
public class StudentResults {
 
	 //STUDENT PRIVATE ATTRIBUTES
	private String Full_Name;
	private String Exam_Name;
	private String Exam_Score;
	private String Exam_Grade;
	
	//STUDENT PUBLIC ATTRIBUTES== defult constructor
	StudentResults(){
		Full_Name = "NO NAME GIVEN";
		Exam_Name = "UNKNOWN";
		Exam_Score = "NO SCORE";
		Exam_Grade = "UNKNOWN";
	}
	  //STUDENT BEHAVIORS
	 
	//name method
	String fullname(String aName) {
		Full_Name = aName;
		return Full_Name;
	}
     //exam method
	String examName(String examCode) {
		
		
		if (examCode.equals("VB")) {
			Exam_Name = "Visual Basic .NT";
		}
		else if(examCode.equals("JV")) {
			Exam_Name = "JAVA";
		}
		else if(examCode.equals("C#")) {
			Exam_Name = "C# .NT";
		}
		else if(examCode.equals("PH")) {
			Exam_Name = "PH";
		}
		else {
			Exam_Name = "NO EXAM SELECTED";
		}
		return Exam_Name;
	}
	//score method
	String examScore(int aScore) {
		Exam_Score = aScore+" out of 50";
		return Exam_Score;
	}
	//Grade method
	String examGrade(int aScore) {
		Exam_Grade =this.getGrade(aScore) ; //THIS TURNS A SCORE INTO A GRADE 
		return Exam_Grade;
	}
	private String getGrade(int aScore ) {
		String ExamGrade ="";
		
		if(aScore>=0 && aScore<=10) {
			ExamGrade= "E";
		}
		else if(aScore>=11 && aScore<=20) {
			ExamGrade ="D";
		}
		else if(aScore>=21 && aScore<=30) {
			ExamGrade ="C";
		}
		else if(aScore>=31 && aScore<=40) {
			ExamGrade = "B";
		}
		else if(aScore>=41) {
			ExamGrade = "A";
		}
		return "Grade is "+ExamGrade;
			
	}	
}

