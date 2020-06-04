h = int(input("Wysokość wieży (1 - 10): "))
if h not in range(0, 11):
    print("Wysokość ma być w zakresie 1 - 10")
else:
    for x in range(0, h, 1):
        for y in range(0, x+1, 1):
            print("A", end='')
        print("")
