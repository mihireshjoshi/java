import java.util.Scanner;

public class Exp1{
    public  static void main(String[] args){
        int[][] arr = new int[2][2];
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the elements in array: ");
        for(int i=0;i<=1;i++){
            for(int j = 0; j < 2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("arrray is:");
        for(int i=0;i<=1;i++){
            for(int j = 0; j < 2;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Thee determinent of matrix is: "+((arr[0][0]*arr[1][1])-(arr[0][1]*arr[1][0])));
    }
}