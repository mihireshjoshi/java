public class Exp9 {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println("enter valid");
        }
        finally{
            System.out.println("finally block");
        }
        System.out.println("outside");
    }
}
