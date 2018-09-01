
def quicksort(list):
	less = []
	equal = []
	greater = []
	
	if len(list) > 1:
		pivot = list[0]
		for i in list:
			if i < pivot:
				less.append(i)
			elif i == pivot:
				equal.append(i)
			else:
				greater.append(i)
		return quicksort(less) + equal + quicksort(greater)
	else:
		return list
		
# algorithm complete

def main():
	list = [5,10,1,3,16,7,20]
	sortedList = quicksort(list)
	print(sortedList)

main()
