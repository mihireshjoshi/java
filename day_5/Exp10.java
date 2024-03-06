public class Exp10 {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a/b;
            System.out.println("Result is: "+(a+b));
        } catch (Exception e) {
            System.out.println("the  exception is: \t"+e);
        }
        
    }
}
