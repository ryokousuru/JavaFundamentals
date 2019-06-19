package com.fundamentals.java;
/*
*This class is the starting class of this project
* This is an example of a multi-line comment
*/

public class Main {

    public static void main(String[] args) {
        //moreLesson6();
        lesson6Examples();
        //lesson5Examples();
        //houseExample();
    }

    public static void moreLesson6() {
        Lesson6 myOtherLesson6 = new Lesson6();
        myOtherLesson6.exampleBuilder("Spaghetti", 2);
        myOtherLesson6.exampleChar();
        myOtherLesson6.exampleEscape();
    }

    public static void lesson6Examples() {
        Lesson6 myLesson6 = new Lesson6();
        myLesson6.exampleCharAt();
        myLesson6.exampleConcat(" has awesome donuts");
        myLesson6.exampleEquals("LaMars");
        String myLower = myLesson6.exampleLowercase();
        System.out.println(myLower);
        String myUpper = myLesson6.exampleUppercase();
        System.out.println(myUpper);
        myLesson6.exampleLength();
    }

    public static void lesson5Examples() {
        Lesson5 myLesson5 = new Lesson5();
        myLesson5.showLocalExample();
        myLesson5.showLocalWithParameter(10,12);
        int example = myLesson5.showLocalWithReturn(15,8);
        System.out.println(example);
        myLesson5.showInstanceVariable();
        //myLesson5.showConversions(); //can probably get rid of this line

    }

    public static void houseExample() {
        System.out.println("Welcome to Java");
        House myHouse = new House();
        myHouse.doorOpenClose();
    }

}
