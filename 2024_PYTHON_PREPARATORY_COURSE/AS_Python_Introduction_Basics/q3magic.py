"""
The Magic Castle, the home of the Academy of Magical Arts at California has organized the great 'WonderWorks Magic Show. 3 renowned magicians were invited to mystify and thrill the crowd with their world's spectacular magic tricks. At the end of each of the 3 magicians' shows, the audience were requested to give their feedback in a scale of 1 to
10. Number of people who watched each show and the average feedback rating of each show is known. Write a program to find the average feedback rating of the WonderWorks Magic show.
"""
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
