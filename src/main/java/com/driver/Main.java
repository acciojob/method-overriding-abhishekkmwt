package com.driver;

public class Main {
    public static void main(String[] args){
        A obj1=new A();
        B obj=new B();
        String ans1=obj1.meth();
        String ans2=obj.meth();
        System.out.println(ans1+"    "+ans2);
    }
  
}