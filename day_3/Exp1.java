import java.util.Scanner;

public class Exp1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit");
        int n=sc.nextInt();
        int a=n;
        int b=n;
        int i=0;
        int sum=0;
        int rem=0;
        while(n>=1){
            n=n/10;
            i++;

        }
        
        System.err.println("The no. of digits are: "+i);
        for(int j=i;j>0;j--){
            rem=a%10;
            int abc=1;
            for(int k=i;k>0;k--){
                abc=abc*rem;
                System.out.println(abc);
            }
            sum = sum + abc;
            System.out.println(sum+" "+a);
            a=a/10;    
        }
        if(b==sum){
            System.err.println("Armstrong no.");
        }
        else{
            System.err.println("no armstrong");
        }
    }
}