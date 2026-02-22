
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.*;



public class java_01_reverse_ech  {
    public static void main(String[] args) throws  Exception {
        ServerSocket ss=new ServerSocket(2000);
        Socket stk=ss.accept();

        BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps=new PrintStream(stk.getOutputStream());

        String msg;
        do { 
            msg=br.readLine();
            StringBuilder sb=new StringBuilder(msg);
            sb.reverse();
            msg=sb.toString();
        } while (true);

    }
}
