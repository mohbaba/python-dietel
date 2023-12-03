import java.util.Scanner;



public class SecondLargestNumber{

	public static void main(String[]args){

		Scanner input = new Scanner(System.in);

 		int count = 1;
		int largest = 0;
		int secondLargest =0;
		
		

		while(count <11){
			
			System.out.printf("Enter the number: ");
			int number = input.nextInt();
			
			if(number > largest){
				secondLargest = largest;
				largest = number;
			}else 
			if(number > secondLargest){
				secondLargest = number;
			}
		
			
			count++;

		}
	System.out.printf("largest: %d, second largest: %d",largest,secondLargest);		
	













	}




}