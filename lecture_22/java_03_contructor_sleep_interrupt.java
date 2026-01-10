
class MyThread extends  Thread{
    public MyThread(String name){
        super(name);
        
    }

    public void run(){
        int i=1;
        while(true){
            System.out.println(i++);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class java_03_contructor_sleep_interrupt {
    public static void main(String[] args) {
   
        MyThread t=new MyThread("thread1");
        t.start();
        t.interrupt();

    
    }
}
