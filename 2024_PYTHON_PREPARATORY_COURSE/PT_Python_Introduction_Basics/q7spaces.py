"""
A sentence S is passed as input with one or more spaces in between the words in it. The program must accept S and print it as the output.
"""
S=str(input())
res=" ".join(S.split())
print(res)
