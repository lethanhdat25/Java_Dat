package com.company;

public class Student {
    int id=1;
    String name;
    int age;
    void run(){
        eat();
        System.out.println(this.name+"  Running......."+ this.id);
    }
    void eat(){
        System.out.println(this.name+"   Eatting..........");
    }
}
