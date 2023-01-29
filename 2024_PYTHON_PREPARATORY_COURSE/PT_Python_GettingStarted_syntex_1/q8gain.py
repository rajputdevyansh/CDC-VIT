"""
Vikram buys an old scooter for Rs. A and spends Rs. B on its repairs. If he sells the scooter for Rs. C, what is his gain %?
Write a program to compute the gain %.
Output value should be displayed correct to 2 decimal places. (Use .2f method)
"""
Cost=int(input())
Repair=int(input())
Sell=int(input())
profit=Sell-Cost-Repair
totalC=Cost+Repair
gain=profit/totalC*100
print("%.2f"%gain)
