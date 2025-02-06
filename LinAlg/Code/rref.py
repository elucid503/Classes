from sympy import Matrix

matrix = Matrix([
    [-1, -1, -2],
    [1, 0, 4],
    [1, 1, 2]

])

print(matrix.rref())