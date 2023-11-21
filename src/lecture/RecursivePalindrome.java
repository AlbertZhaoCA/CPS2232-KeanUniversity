package lecture;

//Qinjian Zhao
public class RecursivePalindrome {
    public static boolean isPalindrome(String s){
        if(s.length()<=1)
            return true;
        else if (s.charAt(0)!=s.charAt(s.length()-1))
            return false;
        else
            return isPalindrome(s.substring(1,s.length()-1));
    }

    public static void main(String[] args) {
        System.out.println("is moon a palindrome "+isPalindrome("moon"));
        System.out.println("is noon a palindrome "+isPalindrome("noon"));
        System.out.println("is n a palindrome "+isPalindrome("n"));
    }
}
