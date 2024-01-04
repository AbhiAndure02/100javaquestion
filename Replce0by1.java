public class Replce0by1 {

    public static void main(String[] args) {
        int n =7503020;
        String str1 = Integer.toString(n);
        int l = str1.length();
        String str = "";
        for (int i = 0; i < l; i++) {
            if(str1.charAt(i)=='0'){
                str = str + '1';
            }else{
                str = str+str1.charAt(i);
            }

        }
        System.out.println(str);
    }
}
