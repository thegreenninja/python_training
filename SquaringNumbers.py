try:
    x= int(input("Hello, what is your number? "))
    square=x*x
except ValueError:
    print("Your response is not an integer!")
else:
    print(f"The square of of your number is {square}")
