# This program takes two numbers as inputs from the user
# And prints the addition as output

first_number = input("Please enter the first number: ")
second_number = input("Please enter the second number: ")
try:
    total = int(first_number) + int(second_number)
    print("The addition of your numbers is  " , total)
except:
    print ("Error, looks like you passed invalid numbers.")


