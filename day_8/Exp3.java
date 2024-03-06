class Set extends Thread {
    public static void main(String[] args) {
        Thread t1=new Thread(new Set());
        Thread t2=new Thread(new Set());
        System.out.println("The priority of t1: "+t1.getPriority());
        System.out.println("The priority of t2: "+t2.getPriority());
        t1.setPriority(2);
        t2.setPriority(10);
        System.out.println("The main thread is: "+Thread.currentThread().getPriority());
        System.out.println("The new priority of t1: "+t1.getPriority());
        System.out.println("The new priority of t1: "+t2.getPriority());
    }
}
