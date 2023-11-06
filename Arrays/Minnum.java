package Arrays;

public class Minnum {
    public static  void minimumnumb(int[] arr , int size){
         int min = Integer.MAX_VALUE;
         for(int i = 0 ; i < size ; i++){
             if(arr[i] < min){
                 min = arr[i];
             }
         }
        System.out.println(min);
    }
    public static void main(String[] args) {
        int arr[] = {20,5,1,4};
        int size = 4 ;
        minimumnumb( arr ,  size);
    }
}
