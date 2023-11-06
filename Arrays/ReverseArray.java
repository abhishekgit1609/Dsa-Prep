package Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static   void reverse_array(int size , int[] arr){
        int start = 0 ;
        int end =  size-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }

        for(int i = 0; i < size  ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void swap(int[] arr, int start , int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++ ){
            arr[i] = sc.nextInt();
        }
        reverse_array(size , arr);
    }
}
