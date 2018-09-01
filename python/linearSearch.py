
def linear_search(list):
	inList = False
	index = 0

	for i in list:
		if target == i:
			inList = True
			print("\ntarget", target, "found at index position", index)
		else:
			index += 1

	if inList == False:
		print("\ntarget", target, "is not in the list")

# algorithm complete

def main():
	list = [61,4,1651,86,44,5,1,654,666484]
	target = 1651
	linear_search(list)
