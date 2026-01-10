class Mydata{

   synchronized  public void display(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
    }
}

class Mythread1 extends  Thread{
    Mydata d;
    public Mythread1(Mydata dat){
        d=dat;
    }
    public void run(){
        d.display("hello world");
    }
}
class Mythread2 extends  Thread{
    Mydata d;
    public Mythread2(Mydata dat){
        d=dat;
    }
    public void run(){
        d.display("how are you");
    }
}


public class java_05_practise_synchronized {
    public static void main(String[] args) {
        Mydata d=new Mydata();
        Mythread1 t1=new Mythread1(d);
        Mythread2 t2=new Mythread2(d);
        t1.start();
        t2.start();
    }
}
