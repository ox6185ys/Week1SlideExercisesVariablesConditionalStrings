package com.patrick;
import java.util.*;
public class Main {

    static Scanner stringScanner = new Scanner(System.in);
    static Scanner numberScanner = new Scanner(System.in);

    public static void main(String[] args) {


/*        int numberOfRides = 30;//These need to be double, not int.
        int daysOfFair = 12;//These need to be double, not int.
        double ridesPerDay = numberOfRides / daysOfFair;
        System.out.println(ridesPerDay);

        System.out.println("Enter the distance in miles from MTCT you live. ");
        int distance = numberScanner.nextInt();
        double milesKilometers = (distance * 1.6);
        System.out.println("You live " + milesKilometers + " kilometers from MCTC.");


        //Text data strings.
        String thisClass = "Java Programming";
        String classCode = "ITEC 2545";
        String characters = "%^@#$^&**";
        String quote = "Java is to JavaScript as Car is to Carpet.";
        String aStringWithANewLine = "College = MCTC\nProgram = ITEC";
        String needEscapes = "Tab \t double quote \" in this string.";
        String moreEscapes = "Backslas \\ and newline \nand double quote \" in this string";

        System.out.println(thisClass);
        System.out.println(classCode);
        System.out.println(characters);
        System.out.println(quote);
        System.out.println(aStringWithANewLine);
        System.out.println(needEscapes);
        System.out.println(moreEscapes);


        //Variables int and double.
        int zebras = 4;
        System.out.println("There are " + zebras + " zebras.");
        int cats = 5;
        System.out.println("There are " + cats + " cats.");
        int animals = cats + zebras;
        System.out.println("There are " + animals + " total animals.");

        System.out.println();*/


        double widgetPrice = 4.57;
        double widgetsNeeded = 56;
//      double shippingPrice = 22.23;
        double allWidgetCost = (widgetPrice * widgetsNeeded);
        System.out.println(Math.round(allWidgetCost*100.0)/100.0);

    }
}
