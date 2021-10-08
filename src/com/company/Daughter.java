package com.company;

public class Daughter extends Parent implements Printable{
    String hobby;

    public Daughter(String name, int age, String hobby) {
        super(name, age);
        this.hobby= hobby;
    }


    public String getHobby() {
        return hobby;
    }



    @Override
    public void print() {

        System.out.println(getAge());
        System.out.println(getHobby());
        System.out.println(getName());
    }
}
