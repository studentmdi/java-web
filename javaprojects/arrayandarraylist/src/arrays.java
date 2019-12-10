import java.lang.reflect.Array;

public class arrays {

	public static void main(String[] args) {
	
 //Declearing array in java;
		
		String[] names = { "lamin jatta", "buba sanyang", "binta manneh", "saikou bojang","dara bem"};
		for(int i=0; i<names.length; i++) {
		
			System.out.println(names[i]);
		}
			
		//looping arrays
		
		
			
	   //printing items in the arrray
	
		
		int [] count = new int[42];
		int i;
		for(i=0; i<count.length; i++) {
			count[i]= i+1;

			System.out.println(count[i]);
		}

	}

}
