public class Exp5 {
    public static void main(String[] args) {
        double[] arr=new double[]{100, 80, 60, 70, 60, 75, 85};
        double n=7;
        double[] neo=new double[7];
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                    neo[i+1]=Math.pow(1,3);
                }
            else{
                    neo[i+1]=Math.pow(2,3);
                }
        }
        
        neo[0]=1;
        for(int k=0;k<n; k++){
            System.out.print(neo[k]+" ");
        }
    }
} 
