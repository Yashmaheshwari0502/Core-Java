// 2 class

class MyThread implements   Runnable{
public void run(){
    int i=1;
    while(true){
        System.out.println(i+"hello");
        i++;
    }
}
}

public class java_02_practice_runnable {
    public static void main(String[] args) {
        MyThread m=new MyThread();
        Thread t=new Thread(m);
        t.start();
        int i=1;
        while(true){
            System.out.println(i+"world");
            i++;
        }
    }
}


// 1 class


// public class java_02_practice_runnable implements  Runnable {

// public void run(){
//     int i=1;
//     while(true){
//         System.out.println(i+"hello");
//         i++;
//     }
// }

//     public static void main(String[] args) {
//         java_02_practice_runnable m=new java_02_practice_runnable();
//         Thread t=new Thread(m);
//         t.start();
//         int i=1;
//         while(true){
//             System.out.println(i+"world");
//             i++;
//         }
//     }
// }
