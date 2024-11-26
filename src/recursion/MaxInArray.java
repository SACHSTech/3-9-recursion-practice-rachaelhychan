package recursion;

public class MaxInArray {
    public static int findMax(int[] arr, int n){
        if(n == 1){
            return arr[0];
        }else{
            return Math.max(arr[n - 1], findMax(arr, n - 1));
        }
    }

    public static void main(String[] args) {
        int [] test = {1, 2, 3, 4, 8, 9, 2};
        System.out.println(findMax(test, 7));
    }
}
