pizza_price = 10
customer_name =input("Please enter your name: ")
print ("Each pizza costs ",pizza_price)
pizza_count = input("How many pizzas do you want to order?: ")
try:
    total_cost = int (pizza_count) *  int (pizza_price)
    print ("The total cost is :", total_cost)
    print ("Thank you for visiting" , customer_name.title(), ", please visit again soon!")
except ValueError:
    print("Please use only integers and not letters.")
except:
    print("Oops something went wrong!")

