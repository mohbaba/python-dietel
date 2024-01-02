reset = 1;

while(reset == 1):
	print("");
	print("MENU FUNCTIONS");
	user_input = int(input("1.Phonebook\n2.Messages\n3.Chat\n4.Call Register\n5.Tones\n6.Settings\n7.Call Divert\n8.Games\n9.Calculator\n10.Reminders\n11.Clock\n12.Profiles\n13.SIM Services\n\n"));

	print();
	
	

	if(user_input == 1):
		reset = 2;
		while(reset == 2):
			print("");
			print("PHONEBOOK");
			print("1.Search\n2.Service Nos\n3.Add name\n4.Erase\n5.Edit\n6.Assign tone\n7.Send b'card\n8.Options\n9.Speed dials\n10.Voice tags\n\n");
			user_input = int(input("Enter 0 to go to previous menu \n\n"));
		
			if(user_input == 0):
				reset = 1;
				break;
			elif(user_input == 1):
				print("Search \n\n");
			
			elif(user_input == 2):
				print("Displaying Service nos\n\n");
			
			elif(user_input == 3):
				print("Add name\n\n");
			
			elif(user_input == 4):
				print("Erasing ...\n\n");
	
			elif(user_input == 5):
				print("Editingn\n");
			
			elif(input == 6):
				print("Assigning tone...\n\n");
			elif(input == 7):
				print("Sending b'card to SCHOOL 2\n\n");

			elif(input == 8):
				print("1.Type of view\n2.Memory status\n\n");
			
			user_input = int(input("Enter 0 to go to previous menu \n\n"));
	
	elif(user_input == 2):
		reset = 3;
		while(reset == 3):
			print("");
			print("MESSAGES");
			print("1.Write messages\n2.Inbox\n3.Outbox\n4.Picture messages\n5.Templates\n6.Smileys\n7.Message settings\n8.Info service\n9.Voice mailbox number\n10.Service command editor\n\n");
			user_input = int(input("Enter 0 to go to previous menu \n\n"));

		

			if(user_input == 0):
				reset = 1;
				break
			
			elif(user_input == 1):
				print("Type your message\n\n");
				
			elif(user_input == 2):
				print("No Messages here\n\n");
			
			elif(user_input == 3):
				print("No Messages sent\n\n");
			
			elif(user_input == 4):
				print("Sending picture messages \n\n");
			
			elif(user_input == 5):
				print("No Templates availaible \n\n");
			
			elif(user_input == 6):
				print(":) \n\n");
			
			elif(user_input == 7):
				user_input = input("1.Set 1\n2.Common\n\n");
			
				if(user_input == 1):
					print("1.Message centre number\n2.Messages sent as\n3.Message validity\n\n");
					user_input = int(input("Enter any number to go to previous menu \n\n"));
				
				elif(user_input == 2):
					print("1.Delivery reports\n2.Reply via same centre\n3.Character support\n\n");
					user_input = int(input("Enter any number to go to previous menu \n\n"));
				
	
			
			elif(user_input == 8):
				print("No info services currently\n\n");
			
			elif(user_input == 9):
				print("Voice mailbox number is 23478\n\n");
			
			elif(user_input == 10):
				print("Editor unavailable\n\n");

			user_input = int(input("Enter any number to go to previous menu \n\n"));
 
	elif(user_input == 4):
		reset = 0;
		while(reset == 0):
			print("");
			print("CALL REGISTER");
			print("1.Missed calls\n2.Received calls\n3.Dialled numbers\n4.Erase recent call lists\n5.Show duration\n6.Show call costs\n7.Call cost settings\n8.Prepaid credit\n\n");
			user_input = int(input("Enter 0 to go to previous menu \n\n"));


			if(user_input == 0):
				reset = 1;
				break;

			elif(user_input == 1):
				print("No missed calls\n\n");
		
			elif(user_input == 2):
				print("No received calls\n\n");
		
			elif(user_input == 3):
				print("No dialled numbers!\n\n");
			
		
			elif(user_input == 4):
				print("Erasing...\n");
				print("Recent call lists erased\n\n");
			

			elif(user_input == 5):
				print("1.Last call duration\n2.All calls' duration\n3.Received calls'duration\n4.Dialled calls' duration\n5.Clear timers\n\n");
			elif(user_input == 6):
				print("1.Last call cost\n2.All calls' cost\n3.Clear counters\n\n");
			
			elif(user_input == 7):
				print("1.Call cost limit\n2.Show costs in\n\n");
			
			user_input = int(input("Enter any number to go to previous menu \n\n"));
	
	elif(user_input == 5):
		reset = 4;
		while(reset == 4):
			print("");
			print("TONES");
			print("1.Ringing tone\n2.Ringing volume\n3.Incoming call alert\n4.Composer\n5.Message alert tone\n6.Keypad tones\n7.Warning and game tones\n8.Vibrating alert\n9.Screen saver\n\n");
			user_input = int(input("Enter 0 to go to previous menu \n\n"));
			
			if(user_input == 0):
				reset = 1;
				break;

	elif(user_input == 6):
		reset = 5;
		while(reset == 5):
			print("");
			print("SETTINGS");
			print("1.Call settings\n2.Phone settings\n3.Security settings\n4.Restore factory settings\n\n");
			user_input = int(input("Enter 0 to go to previous menu \n\n"));

			if(user_input == 0):
				reset = 1
				break

			elif(user_input == 1):
				print("1.Automatic redial\n2.Speed dialling\n3.Call waiting options\n4.Own number sending\n5.Phone line in use\n6.Automatic answer\n\n");
			elif(user_input == 2):
				print("1.Language\n2.Cell info display\n3.Welcome note\n4.Network selection\n5.Lights\n6.Confirm SIM service actions\n\n");
			elif(user_input == 3):
				print("1.PIN code request\n2.Call barring service\n3.Fixed dialling\n4.Closed user group\n5.Phone security\n6.Change access codes\n\n");
			
		
			user_input = int(input("Enter any number to go to previous menu \n\n"));
	elif(user_input == 11):

		reset = 6
		while(reset == 6):
		
			print("");
			print("CLOCK");
			print("1.Alarm clock\n2.Clock settings\n3.Date setting\n4.Stopwatch\n5.Countdown timer\n6.Auto update of date and time\n\n");
			user_input = int(input("Enter 0 to go to previous menu \n\n"));
			if user_input == 0:
				reset = 1
				break
		

	