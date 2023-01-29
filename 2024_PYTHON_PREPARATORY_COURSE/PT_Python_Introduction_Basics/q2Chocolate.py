"""
Bala distribute C chocolates to school N students every Friday. The C chocolate are distributed among N students equally and the remaining chocolates R are given back to Bala
As an example if C=100 and N=40,each students receives 2 chocolates and the balance
100-40*2=20 is given back
"""
C=int(input())
N=int(input())
R=C-N*int(C/N)
print(R)
