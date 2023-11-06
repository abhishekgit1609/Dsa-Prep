package Arrays;

public class ExtremePrint {
    public static  void extreme(int[] arr, int size){
        int start = 0 ;
        int end = size -1 ;
        while(start<=end){
            if(start==end){
                System.out.print(arr[start]);
            }
            else {
                System.out.print(arr[start] + " ");
                System.out.print(arr[end] + " ");

            }
            start++;
            end--;
        }

    }
    public static void main(String[] args) {
        int arr[] = {10,20,40,50,60};
        int size = 5;
        extreme(arr, size);
    }
}
