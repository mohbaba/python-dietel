unit = int(input("Enter number of units: "))
new_unit = 0
balance = 0

if unit <= 100:	
	print("No charge on the unit")

if ( unit > 100 and  unit <= 200) or (unit > 100 and unit > 200) :
	new_unit = unit - 100
	#print(new_unit * 10)
	if new_unit <= 100:
		balance = new_unit * 10
		print(balance)
	elif new_unit > 100:
		balance = new_unit * 20
		print(balance - 1000)
	
		
	
		
	
	
	
	
