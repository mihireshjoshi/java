public class Exp3 {
    public static void main(String[] args) {
        int[] a=new int[]{1,2,3};
        int[] b=new int[]{2,4,6};
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
            if(k==m){
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
}
