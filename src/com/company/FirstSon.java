package com.company;

public class FirstSon extends Parent implements Printable{
    int children;

    public FirstSon(String name, int age, int children) {
        super(name, age);
        this.children = children;
    }



    @Override
    public void print() {
        System.out.println(getAge());
        System.out.println(children);
        System.out.println(getName());
    }
}
