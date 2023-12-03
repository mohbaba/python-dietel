import java.util.Scanner;


public class PositiveNegativeCounter{


	public static void main(String[]args){

		Scanner scanner = new Scanner(System.in);
		
		int positive = 0;
		int negative = 0;
		int zero = 0;
		int count = 0;
		int number = 0;

		System.out.print("Enter an integer, type any letter to stop: ");
		//number = scanner.nextInt();

		while(scanner.hasNextInt()){
			
			number = scanner.nextInt();						



			if(number == 0){
				zero++;
			}else
		
			if(number > 0 ){
				positive++;
			}else 

			if(number<0){
				negative++;
			}
			
			System.out.print("Enter an integer, type any letter to stop: ");
			
			count++;
			
		}
			
			
		System.out.printf("The number of positives is %d%n",positive);
		System.out.printf("The number of negatives is %d%n",negative);
		System.out.printf("The number of zeros is %d%n",zero);


}

}
