"""
HillTown Inn is planning to organize a Food Festival bringing together at one place, a wide variety of cuisines from across the world on account of Christmas. The Hotel Management has rented out a square hall of an indoor Auditorium for this extravaganza.
The side of the square hall is y inches in which a large square table is placed for the display of the most popular and celebrated food items. The side of the square table is x inches, such that x<y.
The Management wanted to fill the remaining floor area with a decorative carpet. To get this done, they needed to know the floor area to be filled with the carpet. Write a program to help the Management find the area of the region located outside the square table, but inside the square hall.
"""
a=int(input())
b=int(input())
if(a>b):
    a1=a*a
    b1=b*b
    print(a1-b1)
