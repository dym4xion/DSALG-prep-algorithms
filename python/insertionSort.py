def insertion_sort(list):
	
	for i in range(1, len(list)):
		focusValue = list[i]
		prevIndex = i - 1
		
		while prevIndex > -1 and focusValue < list[prevIndex]:
			list[prevIndex + 1] = list[prevIndex]
			prevIndex -= 1
		
		list[prevIndex + 1] = focusValue	
	
		
# algorithm complete

def main():
	list = [3,4,2,1,7,9,5,10]
	insertion_sort(list)
	print(list)
main()


