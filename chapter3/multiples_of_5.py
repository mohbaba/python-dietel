number = 1

for num in range(1500 , 2701):
	
	if num % (number * 5)  == 0 and num % 7 == 0:
		print(f"{num} is divisible by 7 and multiples of 5")
print("done")