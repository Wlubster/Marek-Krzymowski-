def oblicziloczyn(* elementy):
    if len(elementy) == 0:
        return 0.0
    else:
        iloczyn = elementy[0]

    for i in elementy[1:]:
        iloczyn *= i

    return iloczyn


print(oblicziloczyn())
print(oblicziloczyn(1, 2, 3, 4, 5))
