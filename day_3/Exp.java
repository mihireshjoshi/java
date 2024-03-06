import java.util.*;


public class Exp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[]{4,5,2,3};
        int[] ne=new int[4];
        int n=4;
        for(int i=0;i<n-1;i++){
            for(int k=i+1;k<n;k++){
                if(arr[i]<arr[k]){
                    ne[i]=arr[k];
                    break;
                }
                else{
                    ne[i]=-1;
                }
            }
            
            
        }
        ne[n-1]=-1;
        
        for(int j=0;j<n;j++){
            System.out.println(ne[j]);
        }

    }
}
