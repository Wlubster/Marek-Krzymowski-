import math

i = int(input("podaj liczbe: "))
try:
    print(math.sqrt(i))
except:
    print("Podana liczba jest ujemna podaj liczbę dodatnią!")
