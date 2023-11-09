package twoD;

import java.util.Scanner;

public class Diaognal {
    public  static void diaognal(int[][] arr, int row , int col){
        int sum = 0 ;
        for(int i = 0 ; i<row ; i++){
            sum+= arr[i][i];

        }
        System.out.println(sum);
    }
    public  static void reversediaagonal(int[][] arr, int row , int col){
        int sum = 0 ;
        int j = 0 ;
        for(int i = row-1; i>=0 ; i--){
            sum+= arr[i][j];
            j++;

        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i = 0 ; i < row ; i++){
            for (int j = 0 ; j < col ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        diaognal(arr,row,col);
        reversediaagonal(arr, row , col);

    }
}
