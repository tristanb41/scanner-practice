import java.util.Scanner;
public class Scannerpractice {
	
	public static void main(String[] args) {
		int age;
		String name;  
		
		Scanner fred = new Scanner (System.in);
		System.out.println("What is your age?");
		age = fred.nextInt();
		System.out.println("I am "+ age + " too");
		Scanner tim = new Scanner (System.in);
		System.out.println("What is your name?");
		name = tim.nextLine();
		System.out.println("My name is "+ name + " also" );
		
	}

}
