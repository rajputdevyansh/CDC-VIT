"""
Write a python program to remove nth index character from a non-empty string.
"""
Instr=str(input())
Rstr=int(input())
Instr=Instr[:Rstr]+Instr[Rstr+1:]
print(Instr)
