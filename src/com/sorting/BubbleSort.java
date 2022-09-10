package com.sorting;

public class BubbleSort {
    public static void sort(int arr[]){

        int n = arr.length;
        for(int i = 0;i<n;i++){
           for(int j =i+1;j<n;j++){
               if(arr[i] > arr[j]){
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
           }
        }
        for(int temp : arr){
            System.out.print(temp + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {18,17,0,0,-8,12};
        sort(arr);
    }

}
