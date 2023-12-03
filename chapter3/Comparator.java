import java.util.Scanner;

public class Comparator{

	public static void main(String[]args){


		

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter any integer number(0 to cancel): ");
		int num1 = scanner.nextInt();

		while(num1 != 0){

			System.out.print("Enter second integer: ");
			int num2 = scanner.nextInt();

			if(num1 == num2){
				System.out.println("0");

			}else 
			if(num1 > num2){
				System.out.println("1");
			}else{
				System.out.println("-1");
			}
			
			System.out.print("Enter any integer number(0 to cancel): ");
		num1 = scanner.nextInt();




		}









}














}