import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your age: ");
		Double age = input.nextDouble();
		
		System.out.print("Please enter your weight: ");
		Double weight = input.nextDouble();
		
		input.close();
		
		//If Statements
		
		if (age <= 10 && weight < 80) {
			System.out.println("This person needs to ride the black roller coaster.");
		}
		
		else if (age <= 10 && weight < 80) {
			System.out.println("This person needs to ride the black roller coaster.");
			
		}
	}

}
