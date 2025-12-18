interface member {
    void callback();
}

class store {
    member mem[] = new member[100];
    int count = 0;

    void register(member m) {
        mem[count++] = m;
    }

    void invite() {
        for (int i = 0; i < count; i++) {
            mem[i].callback();
        }
    }
}

class customer implements member {
    String name;

    public customer(String name) {
        this.name = name;
    }

    public void callback() {
        System.out.println("ok i will visit: " + name);
    }
}

public class java_01_callback_methods {
    public static void main(String[] args) {
        store st = new store();
        customer c1 = new customer("yash");
        customer c2=new customer("ravi");
        st.register(c1);
        st.register(c2);
        st.invite();

    }
}
