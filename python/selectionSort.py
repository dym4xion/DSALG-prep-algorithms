
def find_smallest(list):
	smallest = list[0]
	smallestIndex = 0
	for i in range(1, len(list)):
		if list[i] < smallest:
			smallest = list[i]
			smallestIndex = i
	return smallestIndex

def selection_sort(list):
	sortedList = []
	for i in range(len(list)):
		smallest = find_smallest(list)
		sortedList.append(list.pop(smallest))
	return sortedList

# algorithm complete

def main():
	list = [2,48,5,1,8,24,8,1,5]
	print(selection_sort(list))

main()
