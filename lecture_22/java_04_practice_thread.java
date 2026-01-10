class MyThread extends  Thread{
    public MyThread(String name){
        super(name);
        
    }

    public void run(){
        int i=1;
        while(true){
            System.out.println((i++)+"My Thread");
            
        }
    }
}

public class java_04_practice_thread {
    public static void main(String[] args) {
        MyThread t=new MyThread("thread1");
        t.setDaemon(true);
        t.start();
        int i=1;
        while(true){
            System.out.println((i++)+"main");
            
        }


       
       
    }
}




