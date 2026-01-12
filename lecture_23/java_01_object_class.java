
class Myobject {

    @Override
    public String toString() {
        return "hello world";
    }

    public int hashCode(){  
        return 100;
    }
    public boolean  equals(Object ob){
        return this.hashCode()==ob.hashCode();
    }

}

public class java_01_object_class {
    public static void main(String[] args) {
        Myobject o1 = new Myobject();
        Myobject o2 = new Myobject();

        System.out.println(o1);
        System.out.println(o1.equals(o2));
    }
}
