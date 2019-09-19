def insertion_sort(list1):
    n = len(list1)
    for i in range(1, n):
        value = list1[i]
        j = i
        while(j>0 and value < list1[j-1]):
            list1[j] = list1[j-1]
            j = j - 1
        list1[j] = value   
      
num1 = [7,2,4,6,8,1,9,3]
print("Unsorted: {}".format(num1))
insertion_sort(num1)
print("Sorted: {}".format(num1))
