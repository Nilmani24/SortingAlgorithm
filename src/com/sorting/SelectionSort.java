package com.sorting;

public class SelectionSort {
    public static void sort(int arr[]){

        int n = arr.length;
        for(int i = 0;i<n;i++){
           int min = arr[i];
           int index = i;
           for(int j =i+1;j<n;j++){
               if(min > arr[j]){
                   min = arr[j];
                   index = j;
               }
           }
          int temp = arr[index];
           arr[index] = arr[i];
           arr[i] = temp;
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
