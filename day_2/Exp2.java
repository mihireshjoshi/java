import java.util.*;


public class Exp2 {
Scanner sc=new Scanner(System.in);
    public void condition(){
        
        System.out.println("Enter no.:");
        int n=sc.nextInt();
        if(n>0){
            System.out.println("number is positive");
        }
        if(n<0){
            System.out.println("number is negative");
        }
        if (n==0) {
            System.out.println("number is 0");
        } 
    }

    public void evenodd(){
        System.out.println("Enter no.:");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("number is even");
        }
        if(n%2!=0){
            System.out.println("number is odd");
        }
        
    }

    public void voting(){
        System.out.println("enter age");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("Elligible to vote");
        }
        if(age<18&&age>0){
            System.out.println("nahi kar sakte aap vote");
        }
        if(age<=0){
            System.out.println("seriously bhai??");
        }
    }

    public static void main(String[] args){
        Exp2 e=new Exp2();
        
        e.condition();
        e.evenodd();
        e.voting();
    }
}
