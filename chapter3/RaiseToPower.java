import java.util.Scanner;

public class RaiseToPower{


	public static void main(String[]args){

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		double num1 = scanner.nextDouble();

		System.out.print("Enter second number: ");
		double num2 = scanner.nextDouble();

		int count = 1;
		int count2 = 0;
		double result = num1;
		while(count < num2){
			num1 = num1;
			result *= num1;
			count++;

		}
		
		System.out.printf("%.0f raise to power %.0f is %.0f",num1,num2,result);

 
		
			



}

}