package Arrays;

import java.util.Scanner;

public class ShiftBy1 {
    public static  void shift(int[] arr , int size){
         int temp = arr[size-1];
         for(int i = size-1 ; i> 0 ; i--){
             arr[i] = arr[i-1];
         }
         arr[0] = temp;

        for(int i = 0  ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]  = new int[size];

        for(int i = 0  ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        shift(arr,size);
    }
}
