package code.leetcode;

import java.util.Scanner;

public class Bin {
    public static void main(String[] args)
    {
//        m1(1);
//        A a=new B();
//        a.method();
B b=new B();
b.method();
    }
    public static void  m1(int i){
        if(i>3)
            return;
        System.out.println(i);
        m1(i+1);
//        m1(i+1);
    }
}


class A{
    void method(){
        System.out.println("A");
    }
    A(){
        System.out.println("A const");
    }
}
class B extends A{
    void method(){
        System.out.println("B");
    }
    B(){
        System.out.println("B const");
    }
}
