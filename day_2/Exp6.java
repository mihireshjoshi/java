import java.util.Scanner;
public class Exp6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enteer the number");
        int i =sc.nextInt(); 
        int count=0, rem;
        while(i>0){
            count++;
            i=i/10;   
        }
        System.out.println("Thee count of numbers is: "+count);
    }    
}
