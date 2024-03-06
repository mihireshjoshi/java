import java.util.*;

public class Exp1_a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int flag=0;
        for(int jawan=0;jawan<=5000;jawan++){
            int n=jawan;
            int a=n;
            int b=n;
            int i=0;
            int sum=0;
            int rem=0;
            while(n>=1){
                n=n/10;
                i++;

            }
            
            
            for(int j=i;j>0;j--){
                rem=a%10;
                int abc=1;
                for(int k=i;k>0;k--){
                    abc=abc*rem;
                }
                sum= sum + abc;
                
                a=a/10;
            
            }
            if(b==sum){
                System.out.println(b);
                flag++;
            }
            
        }
        System.out.println("There are total "+flag+" armtrong number from 0 to 5000");
    }
}
