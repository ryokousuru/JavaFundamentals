package com.fundamentals.java;

/*
 * The contents of this class goes over Lesson 8 content
 * Control Flow Statements
 * */
public class Lesson8 {

    public void basicIfExample(int value1, int value2) {
        System.out.println("Before if Statement");
        if (value1 == value2) {
            System.out.println("Values are equal");
        }
        System.out.println("After if Statement");
    }

    public void basicIfElseExample(int alpha, int beta) {
        System.out.println("Before if statement");
        if (alpha != beta) {
            System.out.println("The values are not equal");
        } else {
            System.out.println("The values are equal");

        }
        System.out.println("End of if statement");

    }               //end method

    public void basicIfElseChainExample(int cozy) {
        System.out.println("Before the if statement");
        if (cozy < 25) {
            System.out.println("The value is less than 25");
        } else if (cozy < 45) {
            System.out.println("The value is greater than 25 but less than 45");
        } else {
            System.out.println("The value is greater than 45");
        }
        System.out.println("End of the if statement");
    }

    public void basicIfAndOrExample(int dizzy) {
        System.out.println("Before the if statement");
        if(dizzy > 100 || dizzy < 50) {
            System.out.println("The value is not between 50 and 100");
        }
        if(dizzy % 2 == 0 && dizzy > 40) {
            System.out.println("The value is greater than 40 and an even number");
        }
    }  //this is the end of the method

    public void basicSwitchExample(int eagle) {
        switch(eagle) {
            case 1:
                System.out.println("eagle = 1");
                break;
            case 2:
                System.out.println(("eagle = 2"));
                break;
            case 5:
            case 4:
                System.out.println("eagle = 4 or 5");
                break;
            default:
                System.out.println("eagle is greater than 5 or maybe between 2 & 4");
                break;
        }
    }
    public void basicWhileExample() {
        int val = 0;  //initialized value
        while(val < 10){  //expression
        System.out.println(val);
        val++;  //increment
        }
    } //method no owari
    public void basicDoWhileExample () {
        int today = 0;
        do {
            if (today % 2 == 0) {
                System.out.println(today);
            }
            today++;
        } while (today < 20);

    } // end if

    public void basicForLoopExample() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    } //end method

    public void basicBranchingExample() {
        for(int i = 0; i < 10; i++) {
            if(i == 2) {
                continue;
            }
            if(i ==8) {
                System.out.println("Loop breaks");
                break;
            }
            System.out.println(i);
        }
        System.out.println("End of the loop");
    } //end the method

}                   //end class
