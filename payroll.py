employee_name = input("Enter employee name: ").title()
month = input("Enter month: ").capitalize()
working_hours = float(input("Enter number of hours worked in a week: "))
hourly_pay_rate = float(input("Enter hourly pay rate: "))
federal_tax_rate = float(input("Enter federal tax-withholding rate: ")) 
state_tax_rate = float(input("Enter state tax withholding rate: "))

gross_pay = working_hours * hourly_pay_rate 
federal_tax = gross_pay * (federal_tax_rate / 100)
state_tax = gross_pay * (state_tax_rate / 100)

deduction = federal_tax + state_tax
net_pay = gross_pay - deduction
print()
print()
print("========================================")
print(f"{employee_name} payroll statement for the month of {month} ")
print("========================================")
print(f"Employee Name:{employee_name}")
print(f"Hours Worked:{working_hours}")
print(f"Hourly Pay Rate:{hourly_pay_rate}")
print(f"Gross Pay:{gross_pay}")
print()
print(f"Deductions")
print(f"Federal Withholding({federal_tax_rate}%): ${round(federal_tax,2)}")
print(f"State Tax Withholding({state_tax_rate}%): ${round(state_tax,2)}")
print(f"Total Deduction: ${round(deduction,2)}")
print(f"Net Pay: ${round(net_pay,2)}")
print("========================================")
