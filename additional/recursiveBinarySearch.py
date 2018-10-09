def recBinSearch(list, target, minima, maxima):
	if minima == maxima:
		return "target not in list"
	elif list[int((minima + maxima) / 2)] == target:
		return "target found"
	elif target < int((minima + maxima) / 2):
		return recBinSearch(list, target, minima, int((minima + maxima) / 2))
	else:
		return recBinSearch(list, target, int((minima + maxima) / 2), maxima)

def main():
	list = [1,2,3,4,5,6,7,8,9,10]
	result = recBinSearch(list, 6, 0, len(list))
	print(result)
main()
##THIS IS WRONG!!!!
