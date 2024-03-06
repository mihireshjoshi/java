
/* 

// Using Thread class
class ChildThread extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("This is Child Thread");
        }
    }

    public static void main(String[] args) {
        ChildThread c=new ChildThread();
        c.start();
        for(int i=0; i<10; i++){
            System.out.println("This is Main Thread");
        }
    }
}

*/

// Using Runnable
class ChildThread implements Runnable{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("This is Child Thread");
        }
    }

    public static void main(String[] args) {
        Thread t=new Thread(new ChildThread());
        t.run();
        for(int i=0; i<10; i++){
            System.out.println("This is Main Thread");
        }
    }
}
