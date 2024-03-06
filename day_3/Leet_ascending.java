import java.lang.*;

public class Buy {
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,10,5,7};
        int n=nums.length;
        int[] neo=new int[n-1];
        int k=0;
        int check=0;
        int avg=0;
        if(n>2){
            for (int i = 1; i < n; i++) {
                if (nums[i] != nums[0]) {
                    break;
                }
                else{
                    avg++;
                }
            }
            if(avg==n-1){
                System.out.println("false");
                System.exit(0);
            }
        }

        for (int ab = 0; ab < n - 1; ab++) {
            if (nums[ab] > nums[ab + 1]) {
                continue; 
            }
            else{
                check++;
            }
        }

        if(check==n-1){
            System.out.println("true");
            System.exit(0);
            
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==i){
                    continue;
                }
                else{
                    neo[k]=nums[j];
                    k++;
                }
            }
            
            k=0;
            int flag=0;
            for (int srk = 0; srk < n - 2; srk++) {
                if (neo[srk] < neo[srk + 1]) {
                    flag++; 
                }
                
            }
            if(flag==n-2){
                System.out.println("true");
                System.exit(0);
            }
        }
        System.out.println("false");
    }
}
