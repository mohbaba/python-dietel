import java.util.Scanner;


public class FindNumberOfYears{

	public static void main(){

	Scanner input = new Scanner(System.in);
	

	System.out.println("Enter any number of minutes");
	int userInput = input.nextInt();

	int daysInYear = 365;
	int minutes = 60; 
	int hours = 60;
	int seconds = 60;
	int day = 24;


	int minutesInDay = minutes * day;
	int minutesInYear = daysInYear * minutesInDay;  
	float results = userInput / minutesInYear;












}













}