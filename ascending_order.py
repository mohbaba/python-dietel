num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))
num3 = int(input("Enter third number: "))

largest = 0
smallest = 0
middle = num1

if num1 > num2 and num1 > num3:
	largest = num1
if num2 > num1 and num2 > num3:
	largest = num2
if num3 > num1 and num3 > num2:
	largest = num3


if num1 < num2 and num1 < num3:
	smallest = num1
if num2 < num1 and num2 < num3:
	smallest = num2
if num3 < num1 and num3 < num2:
	smallest = num3

if num1 < num2 and num1 > num3:
	middle = num1
if num2 < num1 and num2 > num3:
	middle = num2
if num3 < num1 and num3 > num2:
	middle = num3


print(f"{smallest},{middle},{largest}")