/**
 * @class: PaintedRoom
 * @author: Jan Kaltenegger
 * @version: 1.0
 * Course: ITEC 2140 - 04
 * Written: February 07, 2023
 *
 * Description: This class calculates how much paint you would need in gallons and quarts to paint a given room.
 */

import java.util.Scanner;

public class PaintedRoom {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the width of your room in feet: ");
        double width = in.nextDouble();
        System.out.println("Enter the length of your room in feet: ");
        double length = in.nextDouble();
        System.out.println("Enter the height of your room in feet: ");
        double height = in.nextDouble();

        System.out.println("Enter the amount of windows in your room: ");
        int windows = in.nextInt();
        System.out.println("Enter the amount of doors in your room: ");
        int doors = in.nextInt();

        //Calculates area of the room, minus the ceiling and area doors and windows take up.
        double area = (((width * length) + (2 * length * height) + (2 * width * height)) - (windows * 15) - (doors * 21));
        int gallons = (int) area / 350;
        double quarts = (area / 350) % 4;

        System.out.println("You would need " + gallons + " gallons, and " + quarts + " quarts to paint the given room.");
    }
}
