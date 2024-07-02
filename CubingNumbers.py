try:
    x= int(input("Hello, what is your number? "))
    cubed=x*x*x
except ValueError:
    print("Your response is not an integer!")
else:
    print(f"The cube of of your number is {cubed}")
