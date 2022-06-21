package com.twelvedays;

/** Class : Welcome to Twelve Days of Christmas .
 * @author Mangesh
 * @since 21-06-2022
 */
public class TwelveDays {

    public static void main(String[] args) {
        for (int index = 1; index <= 12; index++) {
            System.out.print(" \nOn the ");

            switch (index) {
                case 1:
                    System.out.print("first");
                    break;
                case 2:
                    System.out.print("second");
                    break;
                case 3:
                    System.out.print("third");
                    break;
                case 4:
                    System.out.print("fourth");
                    break;
                case 5:
                    System.out.print("fifth");
                    break;
                case 6:
                    System.out.print("fixth");
                    break;
                case 7:
                    System.out.print("seventh");
                    break;
                case 8:
                    System.out.print("eighth");
                    break;
                case 9:
                    System.out.print("ninth");
                    break;
                case 10:
                    System.out.print("tenth");
                    break;
                case 11:
                    System.out.print("eleventh");
                    break;
                case 12:
                    System.out.print("twelfth");
                    break;
            }

            System.out.print(" day of Christmas my true love gave to me:");

            switch (index) {
                case 12:
                    System.out.print(" twelve Drummers Drumming,");
                case 11:
                    System.out.print(" eleven Pipers Piping,");
                case 10:
                    System.out.print(" ten Lords-a-Leaping,");
                case 9:
                    System.out.print(" nine Ladies Dancing,");
                case 8:
                    System.out.print(" eight Maids-a-Milking,");
                case 7:
                    System.out.print(" seven Swans-a-Swimming,");
                case 6:
                    System.out.print(" six Geese-a-Laying,");
                case 5:
                    System.out.print(" five Gold Rings,");
                case 4:
                    System.out.print(" four Calling Birds,");
                case 3:
                    System.out.print(" three French Hens,");
                case 2:
                    System.out.print(" two Turtle Doves, and");
                case 1:
                    System.out.print(" a Partridge in a Pear Tree.");
                    break;
            }
        }
    }
}

