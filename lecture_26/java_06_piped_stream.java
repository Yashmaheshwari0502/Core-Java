
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class producer extends  Thread{
    OutputStream os;
    public producer(OutputStream o){
        os=o;
    }
    public void run(){
        int count =1;
        while(true){
            try {
                os.write(count);
                os.flush();

                System.out.println("producer "+count);
                System.out.flush();

                Thread.sleep(100);
                count++;

            } catch (Exception e) {
            }
        }
    }
}


class consumer extends  Thread{
    InputStream os;
    public consumer(InputStream o){
        os=o;
    }
    public void run(){
        int x;
        while(true){
            try {
               x=os.read();

                System.out.println("consumer "+x);
                System.out.flush();

                Thread.sleep(100);
                
                
            } catch (Exception e) {
            }
        }
    }
}


public class java_06_piped_stream {
    public static void main(String[] args) throws  Exception {
        PipedInputStream pis=new PipedInputStream();
        PipedOutputStream pos =new PipedOutputStream();

        pos.connect(pis);

        producer p=new producer(pos);
        consumer c=new consumer(pis);

        p.start();
        c.start();
    }
}
