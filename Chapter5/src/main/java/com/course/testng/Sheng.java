package com.course.testng;

public class Sheng {

    public Sheng() {
        System.out.println("Class Sheng created...");
    }

    public void dance() {
        System.out.println("I can dance!!");
    }

    public static void main(String [] args) {
        Sheng s1 = new Sheng();
        s1.dance();
    }
}

