package mypack2;

import mypack1.demo1;

class test2 extends demo1 {

    public void show() {

        System.out.println(a); // public access
        System.out.println(b); // protected access
        System.out.println(c);
        System.out.println(d);
    }

}