package Arrays;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Sort01 {
    public static  void sort(int[] arr , int size){

        //2-POINTER APPROACH
        int left = 0 ;
        int right = size-1;

        while(left<=right){
            if((arr[left] == 0  && arr[right]==1) || (arr[left] == 1 && arr[right]==0)){
                swap(arr,left,right);
                left++;
                right--;
            }
            else if(arr[left]==0 && arr[right]==0){
                left++;
            }
            else{
                right--;
            }
        }

        for(int i = 0 ; i  < size ; i++){
            System.out.print(arr[i]+" ");
        }

















        //COUNT APPROACH
//        int countzero  = 0 ;
//        int countone  = 0;
//        ArrayList<Integer> newarr = new ArrayList<>();
//        for(int i = 0 ; i < size ; i++ ){
//            if(arr[i] == 0){
//                countzero++;
//            }
//            else {
//                countone++;
//            }
//        }
//
//        while(countzero>0){
//            newarr.add(0);
//            countzero--;
//        }
//        while(countone>0){
//            newarr.add(1);
//            countone--;
//        }
//
//
//        System.out.print(newarr+ " ");


    }

    public  static void swap(int[] arr ,int left , int right){
        int temp = arr[left] ;
        arr[left] = arr[right];
        arr[right] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]  = new int[size];

        for(int i = 0  ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        sort(arr,size);
    }
}
