"""
Write a program to print the sum of the first K natural numbers.
"""
K=int(input())
sum=0
for i in range(1,K+1):
    sum=sum+i
print(sum)
