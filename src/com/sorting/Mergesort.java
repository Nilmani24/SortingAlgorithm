package com.sorting;

public class Mergesort {


    public static void sort(int arr[],int left ,int right){
        if(left < right){
            int middle = left + (right - left)/2;
            sort(arr,left,middle);
            sort(arr,middle+1,right);
            merge(arr,left,middle,right);
        }


    }
    public static void merge(int arr[],int left ,int middle, int right){

        int temp[] = new int[right-left+1];

        int i = left;
        int j=middle+1;
        int index =0;
        while(i<=middle && j<=right){
            if(arr[i] >= arr[j]){
                temp[index] = arr[j];
                 j++;
            }else{
                temp[index] = arr[i];
                i++;
            }
            index++;
        }
        for(;i<=middle;i++){
            temp[index++] = arr[i];
        }
        for(;j<=right;j++){
            temp[index++] = arr[j];
        }
        index = 0;
        for(int k =left;k<=right;k++){
            arr[k] = temp[index++];
        }

    }

    public static void main(String[] args) {
        int arr[] = {18,17,0,0,-8,12};
        sort(arr,0,arr.length-1);
        for(int temp : arr){
            System.out.print(temp+ " ");
        }
    }
}
