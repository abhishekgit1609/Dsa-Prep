package Arrays;

import java.util.Scanner;

public class ShiftByk {
    public static  void shiftbyK(int[] arr, int size ,int k) {

        int[] temp = new int[k];
        // 10 20 30 40 50

        for(int i = 0 ; i<k;i++){
            temp[i] = arr[size-k+i];
        }

        for(int i = size-1; i>=k;i--){
            arr[i] = arr[i-2];
        }


        for(int i = 0; i < temp.length ; i++){
            arr[i] = temp[i];
        }







        for(int i = 0  ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]  = new int[size];
        int k = sc.nextInt();

        for(int i = 0  ; i < size ; i++){
            arr[i] = sc.nextInt();
        }

        shiftbyK(arr,size , k);
    }
}
