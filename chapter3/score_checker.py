count = 0
no_of_pass = 0
no_of_fail = 0

score = float(input("Enter student scores(Enter -1 to cancel): "))

while score != -1:
	if score < 0:
		print("Enter valid score!")
		#score = float(input("Enter student scores(Enter -1 to cancel): "))
	elif score > 100:
		print("Enter valid score!")
		# score = float(input("Enter student scores(Enter -1 to cancel): "))
	elif score >= 45 and score <=100:
		no_of_pass += 1
	elif score < 45 and score >= 0:
		no_of_fail += 1
	score = float(input("Enter student scores(Enter -1 to cancel): "))

print(f"Number of passes: {no_of_pass}")
print(f"Number of failurec: {no_of_fail}")
	