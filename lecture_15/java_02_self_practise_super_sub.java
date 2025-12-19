class tv {
    public void switchOn() {
        System.out.println("tv on");
    }

    public void changeChannel() {
        System.out.println("tv channel changed");
    }
}

class smarttv extends tv {
    public void switchOn() {
        System.out.println("Smarttv on");
    }

    public void changeChannel() {
        System.out.println("Smarttv channel change");
    }
    public void browse(){
        System.out.println("Smarttv browse");
    }
}

public class java_02_self_practise_super_sub {
    public static void main(String[] args) {
        tv t1=new tv();
        t1.changeChannel();
        t1.switchOn();
       

    }
}
