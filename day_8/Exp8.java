class ChildThread extends Thread{
    public void run(){

        try {
            for(int i=0; i<5; i++){
            
                System.out.println("This is Child Thread");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            
            System.out.println("Interrupted exception occured");
        }
        
    }

}

class Demoa{
    public static void main(String[] args) {
        
        ChildThread t=new ChildThread();
       // t.setPriority(MAX_PRIORITY);
        t.start();
       // Thread.currentThread().setPriority(MAX_PRIORITY);
        t.interrupt();
        try {
            for(int i=0; i<5; i++){
                System.out.println("This is main Thread");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            
            System.out.println("Interrupted exception occured");
        }
    }
}
    
// When any thread is not in sleeping or waiting state and even then it is interrupted then it ia a WASTED CALL. 