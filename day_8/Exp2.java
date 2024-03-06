class Demo extends Thread {
    public static void main(String[] args) {
        Thread t1=new Thread(new Demo());
        Thread t2=new Thread(new Demo());
        System.out.println("The name of t1: "+t1.getName());
        System.out.println("The name of t2: "+t2.getName());
        t1.setName("mihi");
        System.out.println("The main thread is: "+Thread.currentThread().getName());
        System.out.println("The name of t1: "+t1.getName());
    }
}
