public class Exp8 {
    public static void main(String[] args) {
        int a=5,b=0;
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println("Denominator cannot be zero");
        }
    }
}
