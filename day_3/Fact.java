import java.util.*;

public class Fact {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter number");
        int n=sc.nextInt();
        int fact=1;
        while(n>0){
            fact=fact*n;
            n--;
        }
        System.err.println("factorial is: "+fact);
    }
}
