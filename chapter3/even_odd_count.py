even_count = 0
odd_count = 0
for number in range(1,102):
	if number % 2 == 0:
		even_count += 1
	elif number % 2 != 0:
		odd_count += 1

print(f"Number of even numbers: {even_count} ")
print(f"Number of odd numbers: {odd_count} ")