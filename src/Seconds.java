/**
 * @class: Seconds
 * @author: Jan Kaltenegger
 * @version: 1.0
 * Course: ITEC 2140 - 04
 * Written: February 07, 2023
 *
 * Description: This class calculates a given amount of seconds into hours, minutes and seconds.
 */

import java.util.Scanner;

public class Seconds {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the amount of seconds you wish to convert: ");
        int seconds = in.nextInt();

        int hours = (seconds / 60) / 60;
        int minutes = (seconds / 60) % 60;
        int secondsRemainder = seconds % 60;

        System.out.println("Your converted seconds came out to: " + hours + " hours " + minutes + " minutes and " + secondsRemainder + " seconds.");
    }
}
