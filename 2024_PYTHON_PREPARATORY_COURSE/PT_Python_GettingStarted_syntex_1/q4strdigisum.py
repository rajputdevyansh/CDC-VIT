"""
Write a Python program to compute the sum of digits of a given string.
"""
Instr=str(input())
sum=0
for i in Instr:
    if i.isdigit()==True:
        j=int(i)
        sum=sum+j
print(sum)
