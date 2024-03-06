//Code to check whether the given number is a power of four or not 



import java.util.Scanner;


class Exp2 {

    boolean powerOfFour(int n){
        
        int i=0;

        while(Math.pow(i, 4)<=n){

            if(Math.pow(i, 4)==n){
                System.out.println("it is the  4th power of: "+i);
                return true;
            }

            i++;
        }
        
        return false;
    }


    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        Exp2 ob=new Exp2();

        System.out.println("Enter the number");
        int n=sc.nextInt();

        System.out.println(ob.powerOfFour(n));

    }

}
