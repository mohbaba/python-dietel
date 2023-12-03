#number = int(input("Enter number: "))

for num in range(1,13):
	
	for number in range(1,13):
		print(f"{num} x {number} = {number * num}")
	print()
	print("",end='')



for num in range(9,0,-1):
	print(str(num)*num)