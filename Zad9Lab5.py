a = input("Podaj liczbę wielocyfrową: ")
lista = list(str(a))

x, wynik = 0, 0
while x < len(lista):
    wynik += int(lista[x])
    x = x+1
else:
    print("Suma cyfr: %i" % wynik)
