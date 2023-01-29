N1=int(input())
R1=float(input())
N2=int(input())
R2=float(input())
N3=int(input())
R3=float(input())
if R1 and R2 and R3 <=10:
    totalP=N1+N2+N3
    totalR=(N1*R1)+(N2*R2)+(N3*R3)
    print(round(totalR/totalP,2))
