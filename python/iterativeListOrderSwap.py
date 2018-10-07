def iterativeListOrderSwap(arr):
  half = int(len(arr)/2)
  for i in range(half):
    arr[i], arr[len(arr)-1-i] = arr[len(arr)-1-i], arr[i] 


def main():
  arr = [1,2,3,4,5]
  print(arr)
  iterativeListOrderSwap(arr)
  print(arr)

main()
