def recursive1ToN(n):
	if n == 1:
		return 1
	else:
		return recursive1ToN(n - 1) + n

def main():
	n = 10
	print("n:", n)
	print(recursive1ToN(n))

main()
	
