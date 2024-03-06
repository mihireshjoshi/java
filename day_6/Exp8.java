
// NOTE: We can also define main method in an abstract class.


abstract class A{
    abstract void m1();
    abstract void m2();
    void m3(){
        System.out.println("non abstract method m3     A");
    }
}

abstract class B extends A{
    void m1(){
        System.out.println("fun m1    B");
    }
    
}

class C extends B{
    void m2(){
        System.out.println("fun m2   C");
    }
}



public class Exp8 {
    public static void main(String[] args) {
        C ob=new C();
        ob.m1();
        ob.m2();
        ob.m3();
    }
}
