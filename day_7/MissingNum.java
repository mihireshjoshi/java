import java.util.Scanner;

public class MissingNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int[] arr=new int[]{0,3,2,1};
        int n=4;
        int flag=0;
       /*  System.out.println("Enter the elements");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        } */

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i!=arr[j]){
                    flag++;
                }
                
            }
            if(flag==n){
                System.out.println(i);
                break;
            }
            
            flag=0;
            
            
        }
    }
}
