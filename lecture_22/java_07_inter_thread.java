 class Mydata{
    int value;
    boolean flag=true;
    synchronized public void set(int v){
            while(flag!=false){
                try{ wait();}catch(Exception e){};
            }
        value=v;
        flag=false;
        notify();
    }
    synchronized public int get(){

        int x=0;
        while(flag!=true){
            try{ wait();}catch(Exception e){};
        }
        x=value;
        notify();
        return x;
    }
}
class Producer extends  Thread{
    Mydata d;
    public Producer(Mydata dat){
        d=dat;
    }
    public void run(){
        int count=1;
        while(true){
            d.set(count);
            count++;
            System.out.println("producer"+count);
        }
    }
}
class Consumer extends  Thread{
    Mydata d;
    public Consumer (Mydata dat){
        d=dat;
    }
    public void run(){
        int count=1;
        int value;
        while(true){
            value=d.get();
            System.out.println("consumer"+value);
        }
    }
}







public class java_07_inter_thread {
    public static void main(String[] args) {
        Mydata d=new Mydata();
        Producer p=new Producer(d);
        Consumer c=new Consumer(d);
        p.start();
        c.start();
    }
}
