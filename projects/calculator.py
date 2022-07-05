first_number = int(input('Enter your first number:'))
second_number = int(input('Enter your second number:'))
usage = """
Please choose your operation below:
1 = Addition
2 = Subtraction
3 = Multiplication
4 = Division
"""
print(usage)

operation = int(input("Enter your choice:"))

if operation == 1:
  result = first_number + second_number
elif operation == 2:
    result = first_number - second_number
elif operation == 3:
    result = first_number * second_number
elif operation == 4:
    result = first_number / second_number
else:
  print("Please choose only from the available options")
  



print(int(result))