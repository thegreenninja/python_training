def addition(x, y):
    return x + y

def subtraction(x, y):
    return x - y

def multiplication(x, y):
    return x * y

def division(x, y):
    if y != 0:
        return x / y
    else:
        return "Error! Division by zero."
x = int(input("What is your first number?"))
y = int(input("What is your second number?"))

def start():
    while True:
        print("1. Add")
        print("2. Subtract")
        print("3. Multiply")
        print("4. Divide")
        print("5. Quit")
        operation= int(input("Which operation would you like to do?"))
        
        if operation== (5):
            print("Bye!")
            break


        elif operation ==(1):
            print(x+y)
        elif operation ==(2):
            print(x-y)
        elif operation==(3):
            print(x*y)
        elif operation==(4):
            print(x/y)
        else:
            print("That is an invalid operation.")
start()
