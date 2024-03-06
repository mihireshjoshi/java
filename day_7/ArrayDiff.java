



import java.util.Scanner;

public class ArrayDiff {

    Scanner sc=new Scanner(System.in);

    void arrayCheck(int[] a,int[] b){
        int flag=0;
        int rep1=0,rep2=0;
        int m=a.length;
        int n=b.length;
        int[] neo1=new int[m];
        int[] neo2=new int[n];
        int k=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i]!=b[j]){
                    ++k;
                }
                else{
                    rep1++;
                    
                }
            }
            if(k==n){
                
                neo1[flag]=a[i];
                k=0;
                flag++;
            }
            k=0;
        }


        flag=0;
        k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(b[i]!=a[j]){
                    ++k;
                }
                else{
                    rep2++;
                    
                }
            }
            if(k==m){
                neo2[flag]=b[i];
                k=0;
                flag++;
            }
            k=0;
        }

        System.out.println("the first array is: ");
        for(int i=0;i<m-rep1;i++){
            System.out.println(neo1[i]);
        }

        System.out.println("the second array is: ");
        for(int i=0;i<n-rep2;i++){
            System.out.println(neo2[i]);
        }
    }

    public static void main(String[] args) {
        ArrayDiff ob=new ArrayDiff();
        int[] a=new int[]{1,3,4,5,8};
        int[] b=new int[]{3,4,6}; 
        ob.arrayCheck(a,b);
    }
}
