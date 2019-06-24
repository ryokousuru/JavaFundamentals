package com.fundamentals.java;
import java.util.Scanner;

public class Week2Lab {

    /*
    * Lab 2 is for finding values for voltage, resistance and current
    * */

    public static void main(String[]args) { //method calculates the current
        double voltage, resistance, current;
        System.out.println("Enter the voltage");
        Scanner in = new Scanner(System.in);
        voltage = in.nextDouble();
        System.out.println("Ok, that is " + voltage + " Volts.\n");
        System.out.println("Now please enter the resistance in KiloOhms");
        System.out.println("For example, \'1\' means 1 KiloOhm:\n");
        resistance = in.nextDouble();
        System.out.println("You entered " + resistance + " KiloOhms.\n");
        double resist = resistance * 1000;
        current = voltage / resist;
        double curr = current * 1000;
        System.out.println("The current is " + curr + " MilliAmps.\n");
    Resistance();
    Voltage();
    }

    public static void Resistance() { //method calculates the resistance
        double voltage, resistance, current;
        System.out.println("Enter the current in MilliAmps");
        System.out.println("For example, \'10\' refers to \"10 MilliAmps\":\n");
        Scanner in = new Scanner(System.in);
        current = in.nextDouble();
        System.out.println("Ok, you just now entered " + current + " MilliAmps.\n");
        System.out.println("Enter the voltage: \n");
        voltage = in.nextDouble();
        System.out.println("You entered " + voltage + " Volts.\n");
        double curr = current / 1000;
        resistance = voltage / current;
        System.out.println("The resistance is " + resistance + " KiloOhms.\n");
    }

    public static void Voltage() {//methods calculates the voltage
        double voltage, resistance, current;
        System.out.println("Enter the resistance in KiloOhms.\n");
        Scanner in = new Scanner(System.in);
        resistance = in.nextDouble();
        System.out.println("You entered " + resistance + " KiloOhms.\n");
        System.out.println("Enter current in MilliAmps.");
        System.out.println("For example, \'10\' means 10 MilliAmps:\n");
        current = in.nextDouble();
        System.out.println("You entered " + current + " MilliAmps." );
        double resist = resistance * 1000;
        double curr = current / 1000;
        voltage = resistance * current;
        System.out.println("The voltage is " + voltage + " volts.");
    }

}