num1=int(input("What is your first number? "))
num2=int(input("What is your second number? "))

if num1<num2:
    number1=num1
    number2=num2
    x=range(num1,num2)
    for n in x:
        print(n)
else:
    number1=num2
    number2=num1
    y=range(number1,number2)
    for n in y:
        print(n)
print(number2)
