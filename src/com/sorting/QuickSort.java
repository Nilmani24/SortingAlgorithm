package com.sorting;

public class QuickSort {

    public static void sort(int arr[],int left,int right){


        if(left < right){
            int pivot = findPivot(arr,left,right);
            sort(arr,left,pivot-1);
            sort(arr,pivot+1,right);
        }

    }
    public static int findPivot(int arr[], int left, int right){
       // int temp[] = new int [] {5,4,3,2,8,11,17,1,3}; // 5,4,3,2,3,11,17,1,8 // 5,4,3,2,3,1,17,11,8
        int pivot = arr[left];  // {5,4,3,2,8,11,17,1}; // 5,4,3,2,1,11,17,8
        int i = left;
        int j = right;

         while(i<j){

             while(i<=right && arr[i] <= pivot) {
                 i++;
             }


             while (j>=0 && arr[j] > pivot){
                 j--;
             }

             if(i<j) {
                 int temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
             }



         }
         int temp = arr[left];
         arr[left] = arr[j];
         arr[j] = temp;
         return j;



    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        sort(arr,0,arr.length-1);
        for(int temp : arr){
            System.out.print(temp+ " ");
        }
    }

}
