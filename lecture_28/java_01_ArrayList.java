
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class java_01_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>(List.of(10,20,30));
         

        al1.add(10);
        al1.add(10);
        al1.add(11);

        Iterator<Integer> it =al1.iterator();
        al1.forEach(System.out::println);



        

       
        

    }
}
