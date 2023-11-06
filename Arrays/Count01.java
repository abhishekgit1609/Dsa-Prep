package Arrays;

public class Count01 {
    public static void count01(int[] arr,  int size , int countzero , int countone){
        for(int i = 0; i <size ; i++){
            if(arr[i] == 0 ){
                countzero++;
            }
            else{
                countone++;
            }
        }
        System.out.println(countzero + " " + countone);

    }
    public static void main(String[] args) {
        int size = 8;
        int arr[] = {0 ,1 ,1 ,1 ,0,0,1,1};
        int countzero = 0;
        int countone = 0 ;
        count01(arr,size,countzero,countone);
    }
}
