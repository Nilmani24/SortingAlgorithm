package com.sorting;

public class InsertionSort {

    public static void sort(int arr[]){

        int n = arr.length;
        for(int i = 1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] >= key){
                arr[j+1] = arr[j];
                 j--;
            }
            arr[j+1] = key;
        }
        for(int temp : arr){
            System.out.print(temp + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {18,17,0,0,-8,12};
        sort(arr);
    }

    // 1 2 3 4 5
    // O(n) in sorted array
}
