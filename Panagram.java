public class Panagram {
    static boolean isPanagram(String str){
        str = str.toLowerCase();

        if(str.length()<26){
            return false;
        }
        for(char i ='a'; i<'z'; i++){
            if(str.indexOf(i)<0){
                return false;

            }

        }

        return true;
    }

    public static void main(String[] args) {
        String str = "abcd efgh ijklm nopqr s tuvwxyz";
        System.out.println(isPanagram(str));
    }
}
