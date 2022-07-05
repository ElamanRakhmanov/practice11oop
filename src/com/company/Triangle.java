package com.company;

public class Triangle {
        int a;
        int b;
        int c;

        void area(){
            double p = (a * b * c)/2;
            System.out.println("Perimeter is " + p);
            double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("Area of a triangle: " + area + " cm^2");
        }
}
