package recursion;

public class Palindrome {
    public static boolean isPalindrome(String s){
        if(s.length() == 1){
            return true;
        }else if(s.length() % 2 == 0){
            return false;
        }else{
            if(s.charAt(0) == s.charAt(s.length() - 1)){
                isPalindrome(s.substring(1, s.length() - 1));
                return true;
            }else{
                return false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("asadasa"));
        System.out.println(isPalindrome("asadaa"));
    }
}
