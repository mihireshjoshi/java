import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int input = sc.nextInt();
        int[] arr=new int[20];
        int i=0;
        int sum=0;
        while(input>=1){
            arr[i]=input%10;
            input=input/10;
            i++;
        } 
        for(int j=0;j<=i;j++){
            sum=sum+arr[j];
        }   
        System.out.println("the summation is "+sum);
    }
}