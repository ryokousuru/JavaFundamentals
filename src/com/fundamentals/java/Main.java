package com.fundamentals.java;
import com.fundamentals.lesson10.Lesson10;
/*
*This class is the starting class of this project
* This is an example of a multi-line comment
*/

public class Main {

    public static void main(String[] args) {
        lesson10Example();
         //lesson9Example();
        //rootBeerSong();
        //lesson8Examples2();
        //lesson8Examples1();
        //lesson7Examples();
        //moreLesson6();
        //lesson6Examples();
        //lesson5Examples();
        //houseExample();
    } //end main method

    public static void lesson10Example() {
        // Try to see a private method in another class
        BottlesOfBeerSong song = new BottlesOfBeerSong();
        //song.lesson10Private(); // cannot access
        Lesson10 myLesson = new Lesson10();
        //myLesson.showLesson(); //cannot access
        //myLesson.showProtected(); //cannot access
    }

    public static void lesson9Example() {
        Lesson9 myLesson9 = new Lesson9();
        myLesson9.basicIntArray();
        myLesson9.basicStringArray();
        myLesson9.basicTwoDimensionalArray();
        myLesson9.basicThreeDimensionalArray();
        myLesson9.basicJaggedArray();
    }

    public static void rootBeerSong() {
        BottlesOfBeerSong song = new BottlesOfBeerSong();
        song.timeToSing();
    }

    public static void lesson8Examples2() {
        Lesson8 otherLesson = new Lesson8();
        otherLesson.basicWhileExample();
        otherLesson.basicDoWhileExample();
        otherLesson.basicForLoopExample();
        otherLesson.basicBranchingExample();
    }

    public static void lesson8Examples1() {
        Lesson8 myLesson8 = new Lesson8();
        myLesson8.basicIfExample(5,10); //prints before & after
        myLesson8.basicIfExample(5,5); //prints before, if and after
        myLesson8.basicIfElseExample(10,12); //not equal
        myLesson8.basicIfElseExample(12,12); //equal
        myLesson8.basicIfElseChainExample(29);
        myLesson8.basicIfAndOrExample(48);
        myLesson8.basicSwitchExample(7);
        myLesson8.basicWhileExample();
    }

    public static void lesson7Examples() {
        Lesson7 myLesson7 = new Lesson7();
        myLesson7.basicMath();
        myLesson7.exampleModulus();
        //myLesson7.addTwoNumbers();
        myLesson7.exampleAssignment1();
        myLesson7.exampleAssignment2();
        myLesson7.exampleRelational();
        myLesson7.exampleIncrement();
        myLesson7.exampleDecrement();
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