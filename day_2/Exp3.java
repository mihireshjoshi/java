import java.util.Scanner;

public class Exp3 {
Scanner sc=new Scanner(System.in);
    public void marks(){
        int m1,m2,m3=0;
        System.out.println("Enter marks:");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        if((m1>45&&m1<=100 )&& (m2>45&&m2<=100) && (m3>45&&m3<=100)){
            System.out.println("Party karr bhai");
        }
        else{
            System.out.println("Kya kar raha hai bhai tu apni life  ke saath, fail ho gaya  tu, aise apne maa baap ka sapna poora karega, tujhe zara nbhi reesponsibilty nahi hai kya, mauj masti bahot karli abb time hai seerious hoja,  tu abhi third year mein hai, 6 mahine mein placement ke liye baithega tab tu kya interview dega?");
        }
    }

    public static void main(String[] args){
        Exp3 ob = new Exp3();
        ob.marks();
    }
}
