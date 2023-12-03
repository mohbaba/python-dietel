import java.util.Scanner;


public class PositiveNegativeAverage{


	public static void main(String[]args){

		Scanner input = new Scanner(System.in);
		
		double total = 0;
		int positive = 0;
		int negative = 0;
		int count = 0;

		System.out.print("Enter an integer, the input ends if it is 0: ");
		int number = input.nextInt();

		if(number == 0){
			System.out.printf("No numbers are entered except 0");
		}else
		
		if(number > 0 ){
			positive++;
		}else 

		if(number<0){
			negative++;
		}

		while(number!=0 ){
			
			total += number;
			
			
			System.out.print("Enter an integer, the input ends if it is 0: ");
			number = input.nextInt();

			
		
			if(number > 0 ){
				positive++;
			}else 

			if(number<0){
				negative++;
			}
			count++;
			
		}

		double average = total/count;

		if(average>0){
			
				
		
		System.out.printf("The number of positives is %d%n",positive);
		System.out.printf("The number of negatives is %d%n",negative);
		System.out.printf("The total is %.1f%n",total);
		System.out.printf("The average is %.2f",average);
		
	
		}
	
	


		
















}














}
