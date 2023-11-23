age = int(input("Enter your age in years: "))

max_heart_rate = 220 - age
min_target_heart_rate = 0.50 * max_heart_rate
max_target_heart_rate = 0.85 * max_heart_rate

print(f"your maximum heart rate is {max_heart_rate} and the range of your target heart rate is {max_target_heart_rate - min_target_heart_rate}")