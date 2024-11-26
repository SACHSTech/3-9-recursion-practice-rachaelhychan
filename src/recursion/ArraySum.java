package recursion;

public class ArraySum {
    public static int sumArray(int[] arr, int n){
            if(n == 1){
                return arr[0];
            }else{
                return arr[n - 1] + sumArray(arr, n - 1);
            }
    
    }
    public static void main(String[] args) {
        int [] test = {1, 2, 3, 4};
        System.out.println(sumArray(test, 4));
    }
}
