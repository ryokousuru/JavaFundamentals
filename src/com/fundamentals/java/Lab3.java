package com.fundamentals.java;
import java.util.Scanner;

public class Lab3 {

    /*
     * The first part of Lab 3 is for determining a description
     * of how well the student did academically depending on
     * the grade
     * */

    public String descriptionOfGrade() {
        System.out.println("Enter the Student\'s Grade; acceptable values are E, V, G, A and F");
        Scanner sc = new Scanner((System.in));
        char grade = sc.next().charAt(0);
        grade = Character.toUpperCase(grade);
        System.out.println("You entered " + grade);
        switch(grade) {
            case 'E':
                return "Excellent";
            case 'V':
                return "Very Good";
            case 'G':
                return "Good Enough";
            case 'A':
                return "Average";
            case 'F':
                return "Failed";
            default:
                return "That's not a valid entry; please try again";
        }
    } //end of the method

    public void divideItByThree() {
        int i = 0;
        while (i < 50) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;

        } //end of the while statement
    } //end of the method

    }