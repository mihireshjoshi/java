class A {
    int ava=90;
}

class D extends A {
    int sum=0;
    void summ(){
        for(int i=ava; i>0; i--){
            sum=sum+i;
        }
        System.out.println("The sum of first "+ava+" numbers is "+sum);
    }
}

class B extends A {
    String hi="Hiii";
    void b(){
        System.out.println(ava);
    }
}

class C extends B {
    void c(){
        System.out.println(hi);
    }
}

public class Exp11{
    public static void main(String[] args) {
        C ob= new C();
        D ob2 = new D();
        ob.c();
        ob.b();
        ob2.summ();
    }
}