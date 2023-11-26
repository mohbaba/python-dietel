dog_name = input("Enter dog name: ");
dog_age = int(input("Enter dog age: "))


if dog_age == 1:
	print(f"{dog_name}'s age in dog years is 10.5 years")
else:
	new_age = (dog_age - 2) * 4 + (2 * 10.5)
	print(f"{dog_name} age in dog years is {new_age} years")