package com.fundamentals.java;
import java.util.Scanner;

public class Lab3 {

/*
* The first part of Lab 3 is for determining a description
* of how well the student did academically depending on
* the grade
* */

public void descriptionOfGrade() {

    System.out.println("Enter the student's grade; acceptable values are as E, V, G, A and F:\n");
    Scanner sc = new Scanner(System.in);
    char grade = sc.next().charAt(0);
    grade = Character.toUpperCase(grade);
    System.out.println("You entered " + grade);

    switch (grade) {
        //case 1: grade == "E";
            //System.out.println("Description: Excellent");
            //break;
        case 2:
          //  char grade == "V";
            //System.out.println("Description: Very Good");
            //break;
        case 3:
        //    char grade == "G";
            //System.out.println("Description: Good");
            //break;
        case 4:
          //  char grade == "A";
            //System.out.println("Description: Average");
            //break;
        case 5:
            //char grade == "F";
            //System.out.println("Description: Fail");
            //break;
        case 6:
            //System.out.println(grade + " is not a valid grade!!");
            //break;
    }
}
/*
     * The second part of Lab 3 is for determining which numbers are multiples
     * of three for a given number that's somewhere between zero and fifty.
     * */
public void divisibleByThree() {
    System.out.println("Enter a number between 0 and 50");




}

}

