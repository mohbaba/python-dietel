import java.util.Scanner;

public class PrimeNumber2{

	public static void main(String[]args){

		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter a number: ");
		int number = input.nextInt();

	
		int prime = 0;
		int count = 1;
		int half = 0;

	
	while(number != 0){

		half = (number / 2) + 1;
		
		if(number % half ==  1){
				System.out.printf("%d is a prime number%n",number);
			}
			
		else{System.out.printf("%d is not a prime number%n",number);}

		
		System.out.print("Enter a positive number, 0 to cancel ");
		number = input.nextInt();
		System.out.print("");
		
		
		
	

	}




}











}