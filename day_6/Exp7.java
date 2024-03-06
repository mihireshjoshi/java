import java.util.Scanner;

interface Ia{
    void dis(int i);
    interface Ib{
        int avg();
    } 
    Scanner sc =new Scanner(System.in);
}

class A implements Ia,Ia.Ib{
    public int avg(){
        System.out.println("enter three marks");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        int per=(m1+m2+m3)/3;
        return per;
    }
    public void dis(int per){
        
        System.out.println(per);
    }
}


public class Exp7 {
    public static void main(String[] args) {
        A ob=new A();
        int k=ob.avg();
        ob.dis(k);
    }
}
