def badajMonotonicznosc(a):
    if a > 0:
        return print("Funkcja jest rosnąca")
    elif a < 0:
        return print("Funkcja jest malejąca")
    else:
        return print("Funkcja jest stała")


print("y = 3x + 2")
badajMonotonicznosc(3)
