for x in range(1, 11):
    for y in range(1, 11):
        print(x*y, end='')
        if x*y < 10:
            print(" ", end='')
        if x*y < 100:
            print(" ", end='')
    print()
