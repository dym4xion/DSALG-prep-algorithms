def digitalSum(n):
	if(len(str(n)) > 1):
		nString = str(n)
		lastInt = int(nString[len(nString)-1:])
		upToLastInt = int(nString[:len(nString)-1])
		return digitalSum(upToLastInt) + lastInt
	else:
		return n

def main():
	n = 2019
	print("n:", n)
	print("digital sum of n:", digitalSum(n))
	
main()
