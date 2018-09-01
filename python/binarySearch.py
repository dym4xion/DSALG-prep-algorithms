from bubbleSort import bubble_sort

def binary_search(list, target):
	bottomLimit = 0 
	upperLimit = len(list)
	found = False
	inList = True
	indexPos = "unknown"

	while not found:
		focus = int(round((bottomLimit + upperLimit) / 2, 0))
		fValue = list[focus]
		if fValue == target:
			found = True
			indexPos = focus
		elif target < fValue:
			print(str(target), "is less than", str(fValue), "ingnore latter half.")
			upperLimit = focus
		elif target > fValue:
			print(str(target), "is greater than", str(fValue), "ingnore former half.")
			bottomLimit = focus
		
		if upperLimit == bottomLimit + 1:
			found = True
			inList = False

	if inList == False:
		print("\ntarget value", target, "is not in the list")
	else:
		print(str(target), "found at index position", str(indexPos))	

# algorithm complete
def main():
	target = 5
	unsortedList = [64,6,10,84,4163,5454,1,2,4,4584,5,42,18]
	sortedList = bubble_sort(unsortedList)
	print("Using :", sortedList)
	binary_search(sortedList, target)

main()
