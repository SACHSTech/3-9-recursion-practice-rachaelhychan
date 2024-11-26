package recursion;

public class Subsets {
    public static void generateSubsets(String s){
        if(s.length() == 0){
            System.out.println("1");
        }else{
            System.out.println(s.)
            generateSubsets(s.substring(s.length() - 2, s.length()));
        }
    }

    public static void main(String[] args) {
        generateSubsets("abc");
    }
}
