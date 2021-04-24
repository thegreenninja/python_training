# This program takes two numbers as inputs from the user
# And prints the division as output

first_number = input("Please enter the first number: ")
second_number = input("Please enter the second number: ")


try:
    total = int(first_number) / int(second_number)
    print ("The division of your numbers is  " , total)
except ZeroDivisionError:
    print ("Error ,please make sure that your second number is not zero.")
except ValueError:
    print ("Please make sure that your numbers are integers.")