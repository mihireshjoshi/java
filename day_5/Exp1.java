import java.util.ArrayList;
import java.util.Arrays;

public class Exp1{
    public static void main(String[] args) {
        int[] arr=new int[] {2,3,5,1,3};
        int neo=3;
        int[] nearr=new int[arr.length];
        nearr=arr;
        boolean[] bol=new boolean[5];
        int max=0;
        int j=arr.length-1;
        while(j>=0){
            if(max<arr[j]){
                max=arr[j];
            }
            j--;
        }
        for(int i=0;i<arr.length;i++){
            if((arr[i]+neo)>=max){
                bol[i]=true;
            }
            else{
                bol[i]=false;
            }
            System.out.println(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(bol[i]);
        }
    }
}

