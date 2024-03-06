import java.util.Scanner;

public class Exp5 {
    public static void main(String[] arra){
        int year=0;
        System.out.println("Enter year");
        Scanner sc = new Scanner(System.in);
        year=sc.nextInt();
        if(year%4==0){
            if(year%400==0){
                System.out.println("Century Leap year");
            }
            else{
                System.out.println("Just a normal wala leap year");
            }
        }
        else{
            System.out.println("not a leap year");
        }
    }
}
