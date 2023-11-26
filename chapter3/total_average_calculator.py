num = int(input("Enter a number, 0 to cancel: "))
total = num
print(f'current sum: {total}')
counter = 0
while num != 0:
	
	num = int(input("Enter a number, 0 to cancel: "))
	total += num
	print(f'current sum: {total}')
	counter += 1
	
print(f'Average is {total / counter}')