num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))
num3 = int(input("Enter third number: "))

sum = num1 + num2 + num3
product = num1 * num2 * num3
average = sum /  3
smallest = num1
largest = 0

if num1 > largest:
	largest = num1
if num2 > largest:
	largest = num2
if num3 > largest:
	largest = num3


if num1 < smallest:
	smallest = num1
if num2 < smallest:
	smallest = num2
if num3 < smallest:
	smallest = num3 

print(f"{largest} is the largest number")
print(f"{smallest} is the smallest number")
print(f"{sum} is the sum of all of the integer ")
print(f"{average} is the average of all of the integer ")
print(f"{product} is the product ")