class ChildThread extends Thread{
    public void run(){

        for(int i=0; i<5; i++){
            Thread.yield();
            System.out.println("This is Child Thread");
            
        }
    }

}

class Demob{
    public static void main(String[] args) {
        
        ChildThread t=new ChildThread();
       // t.setPriority(MAX_PRIORITY);
        t.start();
       // Thread.currentThread().setPriority(MAX_PRIORITY);
        
        for(int i=0; i<5; i++){
            System.out.println("This is Main Thread");
            
        }
    }
}
