"""

Write a Python program to change commas to dots and dots to commas in a string.
"""
Instr=str(input())
Instr=Instr.replace(",","*")
Instr=Instr.replace(".",",")
Instr=Instr.replace("*",".")
print(Instr)
