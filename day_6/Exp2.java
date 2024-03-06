// LeetCode


public class Exp2 {
    public static void main(String[] args) {
        int[] arr=new int[]{3,1,2,10,1};
        int sum=arr[0];
        int i=1;
        while(i<arr.length){
            sum=sum+arr[i];
            arr[i]=sum;
            i++;
        }
        int j=0;
        while (j<arr.length) {
            System.out.println(arr[j]);
            j++;
        }
    }
}
