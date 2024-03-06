public class Exp7 {
    public static void main(String[] args) {
        int[] arr=new int[]{125,100,160,76,150};
        int max=arr[0];
        for(int num:arr){
            if(num>max){
                max=num;
            }
        }
        System.out.println("the max numberr is: "+max);
    }
}
