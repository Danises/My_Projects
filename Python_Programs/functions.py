# 1) Write a Python function named calculate_average that takes 
#a list of numbers as an argument and returns the average of the numbers.

numbers = [1,2,3,4,5,6,7,8,9,10]
def calculate_average(numbers):
    num_length = len(numbers)
    sum_num = 0
    for x in numbers:
       sum_num +=x


    return sum_num/num_length

print(calculate_average(numbers))


# 2) Write a Python function named reverse_string that takes a string
#as an argument and returns the reverse of the string.

def reverse_string(my_string):
    reverse_string = my_string[::-1]
    print(reverse_string)

reverse_string("Daniel")

# 3)Write a Python function named is_prime that takes a 
# number as an argument and returns True if the number is prime and False otherwise.

def is_prime(number):
    if number <2:
        return False
    
    for x in range(2, number):
        if number % x == 0:
            return False
        
    return True

print(is_prime(10))

# 4) Write a Python function named count_words that takes a string as an 
# argument and returns the number of words in the string.

def count_words(muy_string):
    words = muy_string.split()
    return len(words)

print(count_words("Hello I am Daniel"))

# 5)Write a Python function named factorial that takes a number as an 
# argument and returns the factorial of that number.

def factorial(n):
   result = 1
   for i in range(1, n+1):
        result *= i
       
   return result

n = 5
print(factorial(n))  

# 6)Write a Python function named find_maximum that takes a list of
# numbers as an argument and returns the maximum value in the list.

def find_maximum(my_list):
    maximum = numbers[0]
    for number in numbers:
        if number > maximum:
            maximum = number
    
    return maximum

numbers = [3, 7, 2, 9, 5]
print(find_maximum(numbers)) 

#7)Write a Python function named sum_even_numbers that takes a list of 
# numbers as an argument and returns the sum of all even numbers in the list.

def sum_even_numbers(numbers):
    sum = 0
    for x in numbers:
        if x % 2 == 0:
            sum += x
    
    return sum

my_list = [2,4,6,8,10,11]
print(sum_even_numbers(my_list))

# 8)Write a Python function named is_palindrome that takes a string as an 
# argument and returns True if the string is a palindrome and False otherwise.

def is_palindrome(word):
    if word == word[::-1]:
        return True
    else:
        return False

print(is_palindrome("hannah"))

# 9)Write a Python function named find_common_elements that takes two lists as 
# arguments and returns a new list containing the common elements between the two lists.

def find_common_elements(list1, list2):
   set1 = set(list1)
   set2 = set(list2)

   both = list(set1.intersection(set2))

   return both

list1 = [1,2,3,4,5,8,9,10]
list2 = [1,2,4,5,7,8,9,11]
print(find_common_elements(list1, list2))

# 10) Write a Python function named is_anagram that takes two strings as 
# arguments and returns True if the strings are anagrams and False otherwise.

def is_anagram(string1, string2):
    s1 = sorted(string1)
    s2 = sorted(string2)

    return s1 == s2

s1 = "daniel"
s2 = "lenaid"

print(is_anagram(s1,s2))

#Outpurts in order

"""
5.5
leinaD
False
4
120
9
30
True
[1, 2, 4, 5, 8, 9]

True

"""