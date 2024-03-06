import java.util.Scanner;


public class Exp4 {
    public static void  main(String arrgs[]){
        Scanner sc= new Scanner(System.in);
        int m1,m2,m3=0;
        System.out.println("Enter marks:");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        int total=m1+m2+m3;
        int per=(total/3)*100;
        System.out.println("Enter f for mahila enter m for alpha");
        String gen=(String)sc.next();
        System.out.println(gen);
        if(per>=82 && gen.equals("female")){
            System.out.println("SHE can take admission");
        }
        else{
            System.out.println("woh stree hai magar  phir bhi nahi kar sakti");
        }
    }
}
