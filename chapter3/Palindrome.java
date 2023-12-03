import java.util.Scanner;

public class Palindrome{

	public static void main(String[]args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter a five digit number(0 to cancel): ");
	int number = scanner.nextInt();


	while(number != 0){
		int num1 = (number / 10000);
		int num2 = (number / 1000) % 10;
		int num3 = (number / 100) % 10; 
		int num4 = (number / 10) % 10;
		int num5 = number % 10;
		if(number > 10000 && number <100_000){

			if(num5 == num1 && num4 == num2){
				System.out.printf("%d is a palindrome%n",number);
				System.out.print("\nEnter a five digit number(0 to cancel): ");
				number = scanner.nextInt();	
			}
			else{
				System.out.printf("%d is not a palindrome%n",number);
				System.out.print("\nEnter a five digit number(0 to cancel): ");
				number = scanner.nextInt();
			}


			
		}else

		if(number < 10000 || number >= 100_000){
			//System.out.print("Invalid input(0 to cancel): ");
			System.out.print("Invalid input,must be 5 digits(Enter 0 to cancel): ");
			number = scanner.nextInt();
		}

		
	
	
	}
}

}