class Task4 {
    public static void main(String[] args) {
        int n0 = 1234;
        int n1, n2 ,n3, n4;
        int mihi=0;
        n1 = n0%10;
        n0 =n0/10;
        n2 = n0%10;
        n0 =n0/10;
        n3 = n0%10;
        n0 =n0/10;
        n4 = n0%10;
        mihi = n1*1000 + n2*100 + n3*10 + n4*1;
        System.out.println("The reverse of "+n0+" is "+mihi);
    }
}
