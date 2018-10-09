def recBinSearch(list, target, minima, maxima):
  mid = int((minima + maxima) / 2)
  
  if (minima == maxima):
    return "target not in list"
  elif list[mid] == target:
    return "target found"
  elif target < list[mid]:
    return recBinSearch(list, target, minima, mid)
  else:
    return recBinSearch(list, target, mid, maxima)

def main():
  list = [15,27,32,43,57,61,75,82,99,104]
  result = recBinSearch(list, 82, 0, len(list))
  print(result)

main()
## Still not working 
## why???