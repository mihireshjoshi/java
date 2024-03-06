
interface I{
    void m1(char c);
    void m1(char c, String ab);
}

class A implements I{
    public void m1(char c){
        System.out.println(c);
    }
    public void m1(char c,String ab){
        System.out.println("String is: "+ab+" Character is: "+c);
    }

}

public class Exp6 {
    public static void main(String[] args) {
        A ob=new A();
        ob.m1('j');
        ob.m1('j',"hello");
    }
}
