
num1 = int(input("Enter first number: "));
num2 = int(input("Enter second number: "));
count = 1;
result = num1;


while(count < num2):
	result *= num1;
	count += 1;

print(f"{num1} raise to power {num2} is {result}");

 