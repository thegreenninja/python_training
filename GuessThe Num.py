import random

def guess_the_number():
    numberguess = random.randint(1, 100)
    attempts=0
    guess = None

    print("Guess the number between 1 and 100!")

    while guess != numberguess:
        guess = int(input("Enter your guess please. :"))
        attempts+=1
        if guess < numberguess:
            print("Your guess is too low!")
        elif guess== numberguess:
            print("Correct! You guessed the number in" ,(attempts), "attempts!")
        else:
            print("Your guess is too high!")
    print("Thank you for playing!")


guess_the_number()
        