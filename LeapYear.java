import java.util.Scanner;

public class LeapYear {
    boolean isLeapYear(int year){

        if(year % 400 ==0){
            return true;
        } else if (year % 4 ==0 && year % 100!= 0) {
            return true;

        }

        return  false;

    }

    public static void main(String[] args) {
        LeapYear obj = new LeapYear();
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(obj.isLeapYear(year));



    }
}
