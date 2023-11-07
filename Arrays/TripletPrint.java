package Arrays;

import java.util.Scanner;

public class TripletPrint {
    public static  void Triplet(int[] arr , int size){
        for(int i = 0 ; i < size ; i++) {
            for(int j = 0 ; j < size ; j++){
                for(int k = 0 ; k < size ; k++){
                    System.out.print(arr[i] + "," + arr[j] + "," + arr[k] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]  = new int[size];

        for(int i = 0  ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        Triplet(arr,size);
    }
}
