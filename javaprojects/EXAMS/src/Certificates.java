
public class Certificates extends StudentResults{

	private String Certificate;
	
	Certificates(){
		
		//super();
		Certificate = "No Certificate Awarded";
	}
	
	String certificateAwarded (int score) {
		String aGrade = examGrade(100);
		
		if (aGrade.equals("Grade is A")) {
			Certificate = "Certificate Of Excellence";
		}
		else if(aGrade.equals("Grade is B")) {
			Certificate = "Certificate of Achivement";
		}
		
		else if(aGrade.equals("Grade is C")) {
			Certificate = "Certificate of Achivement";
		}
		else {
			Certificate ="No Certificate Awarded";
		}
		return Certificate;
		
	}
	
}
