package com.kenIT;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BinaryRecursiveSearch bRS = new BinaryRecursiveSearch();
        Scanner scanner = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        int low = 0;
        int high = arr.length - 1;

        System.out.println("Input number you find: ");
        int number = scanner.nextInt();
        int result = bRS.binaryRecursiveSearch(arr, low, high, number);
        if (result != -1) {
            System.out.println(result);
        } else{
            System.out.println("No find");
        }
    }
}
