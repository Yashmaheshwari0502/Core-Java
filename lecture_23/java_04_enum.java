enum dept {

    CS("01", "cs base"), ELE("02", "ele base"), MECH("03", "mech base"), IT("04", "it base");

    String head;
    String location;

    dept(String he,String loc){
        this.head=he;
        this.location=loc;
    }

    public String getHead() {
        return head;
    }

    public String getLocation() {
        return location;
    }
}

public class java_04_enum {
    public static void main(String[] args) {

        dept d = dept.ELE;
        System.out.print(d.getHead());
        System.out.println(" "+d.getLocation());

    }
}
