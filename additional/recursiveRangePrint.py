def recursiveRange(x, y):
    if x != y - 1:
        print(str(x + 1) + ", ", end='')
        recursiveRange(x + 1, y)
def main():
    recursiveRange(2, 9)
main()