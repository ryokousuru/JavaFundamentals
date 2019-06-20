package com.fundamentals.java;
import java.util.Scanner; //imports java utility package that allows scanner statements
/*
* The contents of this class goes over the lesson 7 content
* Java Operators
* */

public class Lesson7 {  //class for Java Operators

    int value1 = 27, value2 = 45;   //setting initial variables for basic Math method

    public void basicMath() {  //initializing the method for basic Math
        int addTotal = value1 + value2;   //illustrating addition operator
        int subTotal = value2 - value1;   //illustrating subtraction operator
        int multiplyTotal = value1 * value2;  //illustrating multiplication operator
        int divisionTotal = value2 / value1;  //illustrating division operator
        System.out.println(addTotal);   //printing the results of addition
        System.out.println(subTotal);   //printing the results of subtraction
        System.out.println(multiplyTotal);  //printing the results of multiplication
        System.out.println(divisionTotal);  //printing the results of division
    }

    public void exampleModulus() {   //initializing the method for Modulus
        int modulusTotal = value1 % value2;  /*value1 divided by value2
                                            * leaves what for a remainder?
                                            */
        System.out.println(modulusTotal); //printing out the remainder
    }

    public void addTwoNumbers() {  //initializing the method for adding 2 numbers
        int x, y, z;         //setting the variables
        System.out.println("Enter two integers to calculate their sum."); //output message for user
        Scanner in = new Scanner(System.in); //allows java ability to read user input
        x = in.nextInt();  //getting user input for x variable
        y = in.nextInt();  //getting user input for y variable
        z = x + y;         //adding x to y to get value for z
        System.out.println("The Sum of entered values = "+z);  //outputting calculation result to user
    }

    public void exampleAssignment1() { //initializing the method for addition assignment
        int able = 10, may = 15;       //setting values for the variables
        able += may;                   //able becomes may plus original value of able
        System.out.println(able);      //printing out what able just now became
        may -= able;                   //may becomes original value of may minus able
        System.out.println(may);       //printing out what may just now became
        able *= may;                   //able becomes original value of able times may
        System.out.println(able);      //printing out what able just now became
        able /= may;                   //able becomes original value of able divided by may
        System.out.println(able);      //printing out what able just now became
        may %= able;                   //may becomes original value of may divided by able - the remainder
        System.out.println(may);       //printing out what may just now became.
    }

    public void exampleAssignment2() { //initializing method for shift and bitwise
        int beta=10,charlie=5;    //setting values for the variables
        beta <<= charlie;         //Left shift AND assignment operator to beta
        System.out.println(beta); //printing out beta to see result
        charlie >>= beta;        //Right shift And assignment operator to charlie
        System.out.println(charlie);  //printing out charlie to see the result
        beta &= charlie;            //Bitwise AND assignment operator to beta
        System.out.println(beta);    //printing out beta to see result
        charlie ^= beta;            //Bitwise OR assignment operator to charlie
        System.out.println(charlie);  //printing out charlie to see the result
    }

    public void exampleRelational() {   //initializing method for Relationals
        int easy = 25, friday = 27, golly = 25;  //setting variables
        boolean isSample1 = easy == friday;   //does easy equal friday?
        System.out.println(isSample1);     //printing result
        boolean isSample2 = easy != friday;  //does easy not equal friday?
        System.out.println(isSample2);   //printing result
        boolean isActual = friday > golly;   //is friday bigger than golly?
        System.out.println(isActual);   //printing result
        boolean isActual2 = friday < golly;  //is friday smaller than golly?
        System.out.println(isActual2);    //printing result
        boolean gotozoo = easy >= golly;  //is easy bigger or same as golly?
        System.out.println(gotozoo);    //printing result
        boolean inthezoo = friday <= golly;   //is friday smaller or same as golly?
        System.out.println(inthezoo);  //printing result
    }

    public void exampleIncrement() {    //initializing method for incrementing
        int home = 10, jump, monorail;   //setting variables
        jump = home++;                  //home becomes jump then has 1 added
        System.out.println(jump);       //printing result

        monorail = ++home;              //1 is added to home which then becomes monorail
        System.out.println(monorail);   //printing result
    }

    public void exampleDecrement() {    //initializing method for decrementing
        int toy = 10, Joe, Jillian;     //setting variables
        Joe = toy--;                    //toy becomes joy and then 1 taken away
        System.out.println(Joe);        //printing result
        Jillian = --toy;                //1 is taken away and then it becomes Jillian
        System.out.println(Jillian);    //printing result
    }

}
