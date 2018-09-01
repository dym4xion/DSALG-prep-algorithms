
def selection_sort(list):
	orderedList = []
	for j in range(len(list)):
		minVal = list[0]
		for i in list:
			if i < minVal:
				minVal = i
		orderedList.append(minVal)
		list.remove(minVal)
	return orderedList

# algorithm complete

def main():
	list = [2,48,5,1,8,24,8,1,5]
	print(selection_sort(list))

main()
