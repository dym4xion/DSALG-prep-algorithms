def iterateList(list):
	for i in range(len(list)-1):
		focusIt = list[i]
		nextIt = list[i + 1]
		if focusIt > nextIt:
			list[i] = nextIt
			list[i+1] = focusIt		
	return list

def bubble_sort(list):
	for i in range(len(list) - 1):
		newList = iterateList(list)
		list = newList
	return list

sortedList = bubble_sort([984,98,419,84,18,41,868,48,4,98,18,7,0.1,98])
print(sortedList)
