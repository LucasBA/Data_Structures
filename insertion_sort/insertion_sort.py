#!/usr/bin/python

#insertion sort

def insertion_sort(A):
    for i in range(0,len(A)):
        temp = i
        while (temp > 0 and A[temp-1]>A[temp]):
            temp_b = A[temp]
            A[temp] = A[temp-1]
            A[temp-1] = temp_b
            temp = temp - 1
    return A

if __name__ == '__main__':
    A = [1,2,3,4,5,6,7,8,9,10]
    A = [10,9,8,7,6,5,4,3,2,1]
    print "A= ", A
    insertion_sort(A)
    print "A= ", A
