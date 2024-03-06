import java.util.Scanner;

public class BitCal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 32 bit bit-code");
        String n=sc.next();
        if(n.length()==32){
            char[] b=n.toCharArray();
            int count=0;
            for(int i=0; i<n.length(); i++){
                if(b[i]=='1'){
                    count++;
                }
            }
            System.out.println("The number of 1s is: "+count);
        }
        else{
            System.out.println("Enter valid input of 32 bit");
        }
    }
}
