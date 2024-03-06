import java.util.*;


public class Fibo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int f0=0,f1=1;
        int fn=0;
        System.out.println("Enter number of term: ");
        int n=sc.nextInt();
        while(n>2){
            fn=f0+f1;
            f0=f1;
            f1=fn;
            n--;
        }
        System.out.println("the term is "+fn);
    }
}
