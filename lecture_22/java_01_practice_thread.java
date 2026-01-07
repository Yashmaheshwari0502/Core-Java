
// 2 class

// class Mythread extends  Thread{
//     public void run(){
//         int i=1;
//         while(true){
//             System.out.println(i+"hello");
//             i++;
//         }
//     }
// }

// public class java_01_practice_thread {

//     public static void main(String[] args) {
//         MyThread t=new MyThread();
//         t.start();
//         int i=1;
//         while(true){
//             System.out.println(i+"world");
//             i++;
//         }
//     }
// }


//  class


public class java_01_practice_thread extends  Thread{

    public void run(){
        int i=1;
        while(true){
            System.out.println(i+"hello");
            i++;
        }
        
    }

    public static void main(String[] args) {
        java_01_practice_thread t=new java_01_practice_thread();
        t.start();
        int i=1;
        while(true){
            System.out.println(i+"world");
            i++;
        }
    }
}