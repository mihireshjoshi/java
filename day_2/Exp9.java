import java.util.Scanner;

public class Exp9 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enteer the number");
        int i =sc.nextInt(); 
        int count=1, rem, n;
        while(i>0){
            count=count*i;
            i--;   
        }
        System.out.println("Thee sum of numbers is: "+count);
    }    
}
