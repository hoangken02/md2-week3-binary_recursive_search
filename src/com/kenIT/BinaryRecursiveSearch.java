package com.kenIT;

public class BinaryRecursiveSearch {
    public int binaryRecursiveSearch(int [] arr,int low,int high, int value){
        if (high >= low) {
            int mid = (high + low) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] > value) {
                return binaryRecursiveSearch(arr, low, mid - 1, value);
            } else {
                return binaryRecursiveSearch(arr, mid + 1, high, value);
            }
        }
        return -1;
    }

}
