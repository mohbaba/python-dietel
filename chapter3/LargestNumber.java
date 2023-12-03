import java.util.Scanner;



public class LargestNumber{

	public static void main(String[]args){

		Scanner input = new Scanner(System.in);



		int count = 1;
		int largest = 0;
		int sales =0;
		int num = 0;
		

		while(count <11){

			System.out.printf("Enter the number of units by salesperson %d: ",count);
			int number = input.nextInt();
			
		
			if(number > largest){
				largest = number;
				sales = count;
				
			}
			num = number;
			count++;

		

		}
	System.out.printf("The salesperson with the highest sale is salesperson %d with %d units sold%n",sales,largest);		
	System.out.printf("Last user input is %d ",num);
		













	}




}