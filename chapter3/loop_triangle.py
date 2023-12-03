#count = 1
#for num in range(1,10):
#	print(str(num)*count)
#	count += 1
		


total = 0
count = 0

while True:

	score = float(input("Enter score: "))
	total += score
	count += 1




	if score == -1:
		break

print(f"count is {count}")
print(f"score is {total+1 }")	