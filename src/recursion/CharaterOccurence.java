package recursion;

public class CharaterOccurence {
    public static int countChar(String s, char c){
        if(s.length() == 1){
            if(s.charAt(0) == c){
                return 1;
            }else{
                return 0;
            }
        }else{
            if(s.charAt(s.length() - 1) == c){
                return 1 + countChar(s.substring(0, s.length() - 1), c);
            }else{
                return countChar(s.substring(0, s.length() - 1), c);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(countChar("rrrrrjasdrra", 'r'));
    }
}
