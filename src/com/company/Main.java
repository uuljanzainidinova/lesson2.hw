package com.company;

public class Main {

    public static void main(String[] args) {
        Parent[]arrayParent= {createObject("Daughter"), createObject("FirstSon"),
                createObject("SecondSon")};
       for (Parent a: arrayParent){
           a.print();
       }


    }


public static Parent createObject(String className) {
    switch (className){
        case "Daughter":
            Daughter daughter= new Daughter("uuljan",15,"drawing");
            return daughter;

        case "FirstSon":
            FirstSon firstSon= new FirstSon("john", 34, 2);
            return firstSon;

        case "SecondSon":
            SecondSon secondSon= new SecondSon("tom", 14, 8);
            return  secondSon;
    }
    return null;
}

}