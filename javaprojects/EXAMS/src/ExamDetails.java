
public class ExamDetails {

	public static void main(String[] args) {
		
		
	   /* //STUDENT INFORMATION DETAILS
		StudentResults Student1 = new StudentResults();
		//Student Name;
        String sStudent = Student1.fullname("Bill Gates");
        System.out.println("NAME: "+sStudent);
     
        //Exam Name
        String sExam =Student1.examName("C#");
        System.out.println("COURSE: "+sExam);
        
        // Exam score
        String sScore = Student1.examScore(2);
        System.out.println("SCORE: "+sScore);
        
        //Exam grade
        String Grade = Student1.examGrade(1);
        System.out.println("GRADE: "+Grade);*/
		
		Certificates C1 = new Certificates();
		String exam = C1.examName("VB");
		String award = C1.certificateAwarded(30);
		
		System.out.println(exam +"\n"+award );
		
	}

}
