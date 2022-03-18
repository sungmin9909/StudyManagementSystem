import java.util.Scanner;

public class StudyManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while(num != 6) {
		System.out.println("*** Study Management System Menu ***");
		System.out.println("1. Add Study");
		System.out.println("2. Delete Study");
		System.out.println("3. Edit Study");
		System.out.println("4. View Study");
		System.out.println("5. Show a Manu");
		System.out.println("6. Exit");
		System.out.println("Select one number between 1-6:");
		num =input.nextInt();
		switch(num) {
		case 1:
		   System.out.print("Study Name:");
		   String studyId = input.next();
		   System.out.print("Subject Name:");
		   String subjectName = input.next();
		   break;
		  
		case 2:
		case 3:
		case 4:
			System.out.print("Study Id:");
			String studyId2 = input.next();
			
		}   
		}
	}

}
 