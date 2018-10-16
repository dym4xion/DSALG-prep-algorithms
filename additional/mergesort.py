#param: list
#returns: new sorted list

def mergesort(li):
	result = []
	if len(li) < 2:
		return li
	
	mid  = int(len(li) / 2)
	sortLeft = mergesort(li[:mid])
	sortRight = mergesort(li[mid:])
	
	mergeLeft = 0
	mergeRight = 0
	while mergeLeft < len(sortLeft) and mergeRight < len(sortRight):
		if sortLeft[mergeLeft] > sortRight[mergeRight]:
			result.append(sortRight[mergeRight])
			mergeRight += 1
		else:
			result.append(sortLeft[mergeLeft])
			mergeLeft += 1
	
	result += sortLeft[mergeLeft:]
	result += sortRight[mergeRight:]
	return result
	
def main():
	li = [5,6,7,0,9]
	res = mergesort(li)
	print(res)

main()