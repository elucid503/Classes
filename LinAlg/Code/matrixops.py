from sympy import Matrix

A = Matrix([

    [-5, 5],
    [5, 1],

])

B = Matrix([

    [-4, 4],
    [-3, 3],
    [-4, 3],

])

C = Matrix([

    [-2, -3, 4],
    [-2, -4, -1],

])

result1 = A * C
result2 = B * C

print(result1)
print(result2)