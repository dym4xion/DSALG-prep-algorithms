def recursiveListOrderSwap(arr, first, last):
	if(first < last):
		arr[first], arr[last] = arr[last], arr[first]
		recursiveListOrderSwap(arr, first + 1, last -1)

def main():
	arr = [1,2,3,4,5]
	print(arr)
	recursiveListOrderSwap(arr, 0, len(arr) - 1)
	print(arr)

main()	
