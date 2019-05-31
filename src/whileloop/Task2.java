package whileloop;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter your day name :");
		String dayName = scanner.next();
		
		switch (dayName) {
		case "Monday":
			System.out.println(" 1 ");
		break;
		case "Tuesday":
			System.out.println(" 2 ");
			break;
			default :
				System.out.println(" you entered something else "); 
		
		}
			
		}
}
	


