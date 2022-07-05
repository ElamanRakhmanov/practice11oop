package com.company;

import com.company.Student;

public class Main {
    public static void main(String[] args) {

//        House house = new House();
//        house.floor = 5;
//        System.out.println(house.checkFloor());


        Triangle triangle = new Triangle();
        triangle.a = 8;
        triangle.b = 5;
        triangle.c = 6;

        System.out.println("First side of a triangle: " + triangle.a + " cm");
        System.out.println("Second side of a triangle: " + triangle.b + " cm");
        System.out.println("Third side of a triangle: " + triangle.c + " cm");

        triangle.area();
        

    }
}