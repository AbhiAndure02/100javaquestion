public class Palindrome {

    public static boolean isPalindrome(String str){
        String rev = "";
        for (int i = str.length()-1; i >=0; i--) {
            rev = rev  +  str.charAt(i);

        }
        if(rev.equals(str)){
            return true;
        }
       // System.out.println(rev);
       return false;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));

    }
}
