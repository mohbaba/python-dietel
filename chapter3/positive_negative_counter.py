positive = 0;
negative = 0;
zero = 0;
count = 0;

number = eval(input("Enter an integer, type any letter to stop: "));
	
while(number != 'q'):
	if(number == 0):
		zero += 1;
	elif(number > 0 ):
		positive += 1;
	elif(number<0):
		negative += 1;
	
	number = eval(input("Enter an integer, type any letter to stop: "));
			
	count += 1
	
			
			
print(f"The number of positives is {positive}");
print(f"The number of negatives is {negative}");
print(f"The number of zeros is {zero}");


