package recursion;

public class MaxInArray {
    public static int findMax(int[] arr, int n){
        if(n == 1){
            return arr[0];
        }

        if(arr[n - 1]>arr[n-2]){
            arr[n-2] = arr[n - 1];
        }

        return findMax(arr, n - 1);
    }

    public static void main(String[] args) {
        int [] test = {1, 2, 3, 4, 8, 9, 2};
        System.out.println(findMax(test, 5));
    }
}
