# 1)Write a program to print the numbers 
#from 1 to 10 using a while loop.

x = 1
while x <= 10:
    print(x)
    x+=1

print("---------------")

# 2) Write a program to print the even
#  numbers from 1 to 20 using a for loop

for x in range(1,21):
    if x % 2 == 0:
        print(x)

# 3) Write a program to calculate the sum of 
# the first 10 natural numbers using a while loop.


# 4)Write a program to find the 
# factorial of a number using a for loop.

print("---------------")
number = 5
factorial = 1
for x in range(1, number+1):
    factorial*=x


print(factorial)

# 5) write a program to print a pattern
# using nested loops
print("---------------")

for x in range(1,20):
    for i in range(1,x+1):
        print(i, end="")
    print()