A = [1/x for x in range(1, 11)]
print(A)

B = [2**y for y in range(11)]
print(B)

C = [x for x in B if x % 4 == 0]
print(C)
