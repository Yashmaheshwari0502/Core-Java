import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class java_01_test {

    public static void main(String[] args) throws Exception {

        Class.forName("org.sqlite.JDBC");

        Connection con = DriverManager.getConnection("jdbc:sqlite:mydatabase.db");
        Statement stm = con.createStatement();
         stm.executeUpdate("insert into dept values(70,'Air')");

       

       
        stm.close();
        con.close();
    }
}