lista = [input("Podaj pierwszą liczbę: "), input("Podaj drugą liczbę: "), input("Podaj trzecią liczbę: ")]
print("Kwadraty tych liczb wynoszą: ")
for x in lista:
    print(int(x)**2)

print("")
for x in range(0, 3, 1):
    a = input("liczba: ")
    print("potęga: %i" % int(a)**2)
