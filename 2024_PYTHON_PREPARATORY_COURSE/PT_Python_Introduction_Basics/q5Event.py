"""
Event Details
Be it a last minute get together, a birthday party or corporate events, the "Pine Tree" Event Management Company helps you plan and execute it better and faster. Nikhil, the founder of the company wanted the Pineaxe Event Management System to get and display the event details from his Customers for every new order of the Company.
Write a program that will get the input of the event details like name of the event, type of the event, number of people expected, a string value (Y/N) telling whether the event is going to be a paid entry and the projected expenses (in lakhs) for the event. The program should then display the input values as a formatted output.
"""
Name=str(input())
Type=str(input())
Count=int(input())
Entry=str(input())
Expense=float(input())
print("Event Name :",Name)
print("Event Type :",Type)
print("Expected Count :",Count)
print("Paid Entry :",Entry)
print("Projected Expense : %.1fL"%round(Expense,1))
