package twoD;

import java.util.Scanner;

public class Transpose {
    public static  void Transpose1(int[][] arr, int row , int col){
        int newmatrix[][] = new int[row][col];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                newmatrix[j][i] = arr[i][j];
            }
        }
        for(int i = 0 ; i < row ; i++){
            for (int j = 0 ; j < col ; j++){
                System.out.print(newmatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static  void Transpose2(int[][] arr, int row , int col){

        for(int i = 0 ; i < row ; i++){
            for(int j = i ; j < col ; j++){
                swap(arr,i,j);
            }
        }
        for(int i = 0 ; i < row ; i++){
            for (int j = 0 ; j < col ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public  static void swap(int[][] arr, int row , int col){
        int temp = arr[row][col];
        arr[row][col] = arr[col][row];
        arr[col][row] = temp;
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
        Transpose1(arr,row,col);
        Transpose2(arr,row,col);
    }
}
