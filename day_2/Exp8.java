import java.util.Scanner;

public class Exp8 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enteer the number");
        int i =sc.nextInt(); 
        int count=1, rem, n;
        while(i>0){
            rem = i%10;
            count=count*rem;
            i=i/10;   
        }
        System.out.println("Thee sum of numbers is: "+count);
    }    
}
