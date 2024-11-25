package recursion;

public class EvenNumbers {
    static int curr = 0;
    public static void printEvens(int start, int end){
        if(start % 2 == 0){
            if(start > end){
                return;
            }else{
                System.out.print(start);
                printEvens(start + 2, end);
            }
        }else{
            if(start >= end){
                return;
            }else{
                System.out.print(start + 1);
                printEvens(start + 2, end);
            }
        }

    }

    public static void main(String[] args) {
        printEvens(2, 8); // Output: 2468
    }
}
