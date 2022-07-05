package com.company;

public class Girl {
    String name;
    String gender;
    int age;
    int height;
    String Nationality;

    void tellName(){
        System.out.println(name);
    }
    void tellGen(){
        System.out.println("Gen is " + gender);
    }
    void tellAge(){
        System.out.println("Age is " + age);
    }
    void tellHeight(){
        System.out.println("Height is " + height + " cm");
    }
    void tellNationality(){
        System.out.println("She is " + Nationality);
    }
}
