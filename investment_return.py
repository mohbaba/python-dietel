amount = 1000
time1 = 10
time2 = 20
time3 = 30
rate = 7/100
amount_deposit1 = amount * (1 + rate) ** time1
amount_deposit2 = amount * (1 + rate) ** time2
amount_deposit3 = amount * (1 + rate) ** time3

print(f"The amount deposit at the end ot the {time1}th year is {amount_deposit1} ")     
print(f"The amount deposit at the end ot the {time2}th year is {amount_deposit2} ") 
print(f"The amount deposit at the end ot the {time3}th year is {amount_deposit3} ") 