import math

def f(x): 
    return (math.sin(200)**x)

def CalculateSeriesValues(n):
    sum = 0
    for i in range(1, n+1):
        sum += f(i)
    return sum

def IsDivergentOrConvergent(f):
    for i in range(1, 100):
        if f(i) > 0:
            return "Divergent"
        elif f(i) < 0:
            return "Convergent"
        else:
            return "Divergent or Convergent"
        
def FindInfiniteSum(f):
    sum = 0
    for i in range(1, 100):
        sum += f(i)
    return sum

print(IsDivergentOrConvergent(f))
print(FindInfiniteSum(f))