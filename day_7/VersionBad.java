import java.util.Scanner;



//Solution 1 (Boolean return type)
class Exp1 {

    boolean isBadVersion(int n,int bad, int i){
           
            if(i<bad){
                return false;
            }
            else{
                return true;
            }
    
    }

    public static void main(String[] args) {
        
        Exp1 ob=new Exp1();
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter no. of versions");
        int n=sc.nextInt();
        System.out.println("Enter the bad version");
        int bad=sc.nextInt();
        
        int i=1;

        while(i<=n){

            System.out.println("Is version "+i+" a bad version: "+ob.isBadVersion(n, bad, i));
            i++;

        }

    }
}


//Solution 2 (Less API calls)
/* 
public class Exp1 {

    void isBadVersion(int n,int bad){    
        int i=1;
        while(i<=n){
            if(i<bad){
                System.out.println("False");
            }
            else{
                System.out.println("True");
            }
        }
        
    }

    public static void main(String[] args) {
        
        Exp1 ob=new Exp1();
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter no. of versions");
        int n=sc.nextInt();
        System.out.println("Enter the bad version");
        int bad=sc.nextInt();
        
        ob.isBadVersion(n,bad);

    }
}

*/