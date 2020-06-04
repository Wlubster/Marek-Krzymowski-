h = int(input("Wysokość diamentu (3- 9): "))
if h not in range(2, 10):
    print("Wysokość ma być w zakresie 3 - 9")
else:
    for i in range(1, h + 1):
        i = i - (h // 2 + 1)
        if i < 0:
            i = -i
        print(" " * i + "o" * (h - i * 2) + " " * i)
