import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int input = sc.nextInt();
        int fd=input/10;
        int sd=input%10;
        System.out.println("the summation of "+fd+" and "+sd+" is "+(fd+sd));
    }
}
