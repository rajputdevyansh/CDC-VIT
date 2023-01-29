"""
Write a Python function to reverse a string if it's length is a multiple of 4, else print the string
"""
Instr=str(input())
Ostr=""
if len(Instr)%4==0:
    print(Instr[::-1])
else:
    print(Instr)
