package com.company;

public class SecondSon extends Parent implements Printable{
    int schoolGrade;

    public SecondSon(String name, int age, int schoolGrade) {
        super(name, age);
        this.schoolGrade= schoolGrade;
    }

    public int getSchoolGrade() {
        return schoolGrade;
    }

    @Override
    public void print() {
        System.out.println(getAge());
        System.out.println(schoolGrade);
        System.out.println(getName());
    }
}
