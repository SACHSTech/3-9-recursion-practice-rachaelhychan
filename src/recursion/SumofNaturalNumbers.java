package recursion;

public class SumofNaturalNumbers {
    static int theSum = 0;
    public static int sum(int n) {
        if(n < 1){
            return theSum;
        }else{
            theSum = theSum + n;
            sum(n - 1);
        }

        return theSum;
    }

    public static void main(String[] args) {
        System.out.println(sum(5)); // Output: 15
    }
}
