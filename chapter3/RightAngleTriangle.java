import java.util.Scanner;

public class RightAngleTriangle{


	public static void main(String[]args){

	int count1 = 0;
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the length of the base of the triangle: ");
	int base = input.nextInt();


	if(base > 0 && base <= 10){

		while(count1 <= base){
		
		 int count2 = 0;
		
		while(count2 != count1){
			
			System.out.print("*");
			count2++;
		}
		count1++;
		System.out.println("");
	}
	}else{
		while(base < 0 || base > 10 ){
			System.out.print("Enter valid number between 1 and 10! ");
			base = input.nextInt();
			if(base > 0 && base <= 10){

				while(count1 <= base){
		
		 			int count2 = 0;
		
					while(count2 != count1){
			
						System.out.print("*");
						count2++;
					}
					count1++;
					System.out.println("");
				}
			}
		
		}
	}









}



}