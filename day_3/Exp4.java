// code for series: 1 + x^1/1 + x^2/2 + .... + x^n/n

import java.util.Scanner;

public class Exp4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x:");
        double x=sc.nextInt();
        System.out.println("Enter n:");
        double n=sc.nextInt();
        double sum=1;
        double fact=1;
        for(int i=1;i<=n;i++){
            double k=i;
            fact=1;
            while(k>0){
                fact=fact*k;
                k--;
            }
            sum=sum+(Math.pow(x, i)/fact);
        }
        System.out.println(sum);
    }
}