def recursiveGCD(a, b):
    if b == 0:
        return a
    else:
        return recursiveGCD(b, a%b)
print(recursiveGCD(20, 40))