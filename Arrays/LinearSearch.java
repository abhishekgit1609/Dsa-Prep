package Arrays;

public class LinearSearch {
    public static boolean  linearsearch(int[] arr  , int size , int target ){
        for(int i = 0; i<arr.length ;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]= {3,4,5,1,2};
        int size = 5 ;
        int target = 10;
        if(linearsearch(arr , size ,target)){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
