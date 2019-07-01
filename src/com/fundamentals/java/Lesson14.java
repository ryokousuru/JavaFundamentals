package com.fundamentals.java;
/*
* This class goes over Lesson 14 content
* Static
* */
public class Lesson14 {
    public static final int MY_FIRST_FINAL = 2019;

    public static int myFirstStatic = 45;

    public static void myFirstStaticMethod(int num) {
        int total = MY_FIRST_FINAL * num;
        System.out.println(total);
    } // the end of the method

    public static class MyInnerClass {

        public void myInnerMethod() {
            System.out.println(myFirstStatic);
        }
    }
} // the end of the class
