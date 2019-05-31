package whileloop;

import java.util.Scanner;

public class IfElseStatementCondtionalStatement {

	public static void main(String[] args) {

		// int age =19;
		// if (age > 18) {
		// System.out.println( " adult ");
		// }else if(age <= 18 && age>12) {
		// System.out.println(" teen ");
		// }else if(age <= 12 && age >6 ) {
		// System.out.println("child");
		// }else {
		// System.out.println("not at school age");
		//
		//// basic if else program

		Scanner scanner = new Scanner(System.in);
		System.out.print(" Enter your age : ");
		int age = scanner.nextInt();

		if (age > 18) {
			System.out.println(" adult  ");

		} else if (age > 12) {
			System.out.println(" teen ");
		} else if (age > 6) {
			System.out.println("child");
		} else {
			System.out.println("not at school age"); /// WE CAN DO IN THIS WAY ALSO

		}

	}

}
