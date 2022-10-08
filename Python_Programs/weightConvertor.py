#This program is a conversor of either Lbs to kg or kg to Lbs

weight = float(input("Weight: "))
unit = input("(L)bs or (k)g: ")

if unit.upper() == "L":
    conversion = weight / 2.2
    print(f"{weight} lbs is {conversion} kg")
elif unit.upper() == "K":
    conversion = weight * 2.2
    print(f"{weight} kg is {conversion} lbs")
else:
    print("Type the correct Unit")