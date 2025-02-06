from sympy import Matrix

matrix = Matrix([
    [-1, 1, 1],
    [-1, 2, 0],
    [-1, 1, 1],
])

print(matrix.rref())