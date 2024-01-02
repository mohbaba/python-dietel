import java.util.Scanner;


public class Nokia{


	public static void main(String...args){

	int reset = 1;
	Scanner scanner = new Scanner(System.in);
	while(reset == 1){
		System.out.println("");
		System.out.println("MENU FUNCTIONS");
		System.out.print("1.Phonebook\n2.Messages\n3.Chat\n4.Call Register\n5.Tones\n6.Settings\n7.Call Divert\n8.Games\n9.Calculator\n10.Reminders\n11.Clock\n12.Profiles\n13.SIM Services");

	System.out.println();
	
	int input = scanner.nextInt();

	if(input == 1){
		reset = 2;
	while(reset == 2){
		System.out.println("");
		System.out.println("PHONEBOOK");
		System.out.print("1.Search\n2.Service Nos\n3.Add name\n4.Erase\n5.Edit\n6.Assign tone\n7.Send b'card\n8.Options\n9.Speed dials\n10.Voice tags\n\n");
		System.out.print("Enter 0 to go to previous menu \n\n");
		input = scanner.nextInt();
		if(input == 0){
			reset = 1;
			break;
		}else
		if(input == 1){
			System.out.print("Search \n\n");
		}else
		if(input == 2){
			System.out.print("Displaying Service nos\n\n");
		}else
		if(input == 3){
			System.out.print("Add name\n\n");
		}else
		if(input == 4){
			System.out.print("Assigning tone...\n\n");
		}else
		if(input == 5){
			System.out.print("Editingn\n");
		}else
		if(input == 6){
			System.out.print("Assigning tone...\n\n");
		}else
		if(input == 7){
			System.out.print("Sending b'card to SCHOOL 2\n\n");
		}else
		if(input == 8){
			System.out.print("1.Type of view\n2.Memory status\n\n");
		}
	System.out.print("Enter any number to go to previous menu \n\n");
			input = scanner.nextInt();
	}
	}else 
	
	if(input == 2){
		reset = 3;
		while(reset == 3){

		System.out.println("");
		System.out.println("MESSAGES");
		System.out.print("1.Write messages\n2.Inbox\n3.Outbox\n4.Picture messages\n5.Templates\n6.Smileys\n7.Message settings\n8.Info service\n9.Voice mailbox number\n10.Service command editor\n\n");
		System.out.print("Enter 0 to go to previous menu \n\n");

		input = scanner.nextInt();

		if(input == 0){
			reset = 1;
			break;
		}else

		if(input == 1){
			System.out.print("Type your message\n\n");
		}else

		if(input == 2){
			System.out.print("No Messages here\n\n");
		}else

		if(input == 3){
			System.out.print("No Messages sent\n\n");
		}else

		if(input == 4){
			System.out.print("Sending picture messages \n\n");
		}else

		if(input == 5){
			System.out.print("No Templates availaible \n\n");
		}else
		
		if(input == 6){
			System.out.print(":) \n\n");
		}else		

		if(input == 7){
			System.out.print("1.Set 1\n2.Common\n\n");
			input = scanner.nextInt();
			if(input == 1){
				System.out.print("1.Message centre number\n2.Messages sent as\n3.Message validity\n\n");
			}else
			
			if(input == 2){
				System.out.print("1.Delivery reports\n2.Reply via same centre\n3.Character support\n\n");
			}
			
		}else
		
		if(input == 8){
			System.out.print("No info services currently\n\n");
		}else
		
		if(input == 9){
			System.out.print("Voice mailbox number is 23478\n\n");
		}else
		
		if(input == 10){
			System.out.print("Editor unavailable\n\n");
		}
	System.out.print("Enter any number to go to previous menu \n\n");
	input = scanner.nextInt();
				
	}
 
	}else

	if(input == 4){
	reset = 0;
	while(reset == 0){
		System.out.println("");
		System.out.println("CALL REGISTER");
		System.out.print("1.Missed calls\n2.Received calls\n3.Dialled numbers\n4.Erase recent call lists\n5.Show duration\n6.Show call costs\n7.Call cost settings\n8.Prepaid credit\n\n");
		System.out.print("Enter 0 to go to previous menu \n\n");
		input = scanner.nextInt();

		if(input == 0){
			reset = 1;
			break;
		}else

		if(input == 1){
			System.out.print("No missed calls\n\n");
		}else	

		if(input == 2){
			System.out.print("No received calls\n\n");
		}else		

		if(input == 3){
			System.out.print("No dialled numbers!\n\n");
			
		}else
		
		if(input == 4){
			System.out.print("Erasing...\n");
			System.out.print("Recent call lists erased\n\n");
		}else
		
		if(input == 5){
			System.out.print("1.Last call duration\n2.All calls' duration\n3.Received calls'duration\n4.Dialled calls' duration\n5.Clear timers\n\n");
		}else
			
		if(input == 6){
			System.out.print("1.Last call cost\n2.All calls' cost\n3.Clear counters\n\n");
		}else
		if(input == 7){
			System.out.print("1.Call cost limit\n2.Show costs in\n\n");
		}
	System.out.print("Enter any number to go to previous menu \n\n");
	input = scanner.nextInt();
	}

	}else

	if(input == 5){
		reset = 4;
		while(reset == 4){
			System.out.println("");
			System.out.println("TONES");
			System.out.print("1.Ringing tone\n2.Ringing volume\n3.Incoming call alert\n4.Composer\n5.Message alert tone\n6.Keypad tones\n7.Warning and game tones\n8.Vibrating alert\n9.Screen saver\n\n");
			System.out.print("Enter 0 to go to previous menu \n\n");
			input = scanner.nextInt();
		if(input == 0){
			reset = 1;
			break;
		}
	}

	}else

	if(input == 6){
		reset = 5;
		while(reset == 5){
			System.out.println("");
			System.out.println("SETTINGS");
			System.out.print("1.Call settings\n2.Phone settings\n3.Security settings\n4.Restore factory settings\n\n");
			System.out.print("Enter 0 to go to previous menu \n");
			input = scanner.nextInt();
		if(input == 0){
			reset = 1;
			break;
		}else
		if(input == 1){
			System.out.print("1.Automatic redial\n2.Speed dialling\n3.Call waiting options\n4.Own number sending\n5.Phone line in use\n6.Automatic answer\n\n");
		}else
		
		if(input == 2){
			System.out.print("1.Language\n2.Cell info display\n3.Welcome note\n4.Network selection\n5.Lights\n6.Confirm SIM service actions\n\n");
		}else
		if(input == 3){
			System.out.print("1.PIN code request\n2.Call barring service\n3.Fixed dialling\n4.Closed user group\n5.Phone security\n6.Change access codes\n\n");
		}
	System.out.print("Enter any number to go to previous menu \n\n");
	input = scanner.nextInt();
	}
	}else

	if(input == 11){
		reset = 6;
		while(reset == 6){
		
			System.out.println("");
			System.out.println("CLOCK");
			System.out.print("1.Alarm clock\n2.Clock settings\n3.Date setting\n4.Stopwatch\n5.Countdown timer\n6.Auto update of date and time\n\n");
			System.out.print("Enter 0 to go to previous menu \n\n");
			input = scanner.nextInt();
		if(input == 0){
			reset = 1;
			break;
		}

	}
	}





}


}


}