list = [61,4,1651,86,44,5,1,654,666484]
target = 69
inList = False

for i in list:
	if target == i:
		inList = True
		print("\ntarget", target, "found at index position", i)

if inList == False:
	print("\ntarget", target, "is not in the list")
