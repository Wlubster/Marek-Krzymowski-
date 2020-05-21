print("Zapisywanie liczb podzielnych przez 4 do pliku")
a=0
plik = open("Dzielenie4.txt", "w")
for i in range(1, 100 + 1):
    if i%4 == 0:
        plik.write(str(i) + " ")
print("Zakończono zapisywanie liczb")      
plik.close()
