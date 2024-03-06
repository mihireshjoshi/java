
interface I1{
    int a=5;
    void display(int a);
}

class A implements I1{

    int increment(){

        int k=a+1;
        return k;

    }
    
    public void display(int a){

    }
}

class B extends A implements I1{
    
    public void display(int j){

        System.out.println(j);

    }
}

public class Exp5 {
    public static void main(String[] args) {
        
        B ob=new B();
        int j=ob.increment();
        ob.display(j);

    }
}
