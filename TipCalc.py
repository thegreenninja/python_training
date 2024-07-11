def tipcalc():
    
    bill = float(input("Enter the total bill amount: $"))
    tip = float(input("Enter the tip percentage : "))
    tipamount = bill * (tip / 100)
    total = bill + tipamount

    print(f"\nTip Amount: ${tipamount:.2f}")
    print(f"Total Amount to be Paid: ${total:.2f}")

tipcalc()
