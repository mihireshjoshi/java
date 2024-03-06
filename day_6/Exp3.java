// Interface: hen wwe have multiple solutions to solve the same problem we can use interface.
// It is used to achieve 100% abstraction
// We can achieve multiple inheritance using interface (using 'implements') (interface->interfac by 'extend')



interface I1{
    void show();
    int a=10;
}

class Parent implements I1{
    public void showParent(){
        System.out.println("show parent");
    }
    public void show(){
        System.out.println("overriden show\na= "+a);
    }
}

public class Exp3 {
    public static void main(String[] args) {
        Parent p=new Parent();
        p.showParent();
        p.show();
    }
}


