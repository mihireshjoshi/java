public class Exp8 {
    public static void main(String[] args) {
        int n=4;
        int k=0;
        
        for(int i=1;i<=n;i++){
            if(i%2==0){
                k=n;
            }
            else{
                k=1;
            }
            int j=k;
            while(j>0 && j<=4){
                System.out.print(j+" ");
                if(i%2==0){
                    j--;
                }
                else{
                    j++;
                }
            }
            System.out.println(" ");
        }
    }
}
