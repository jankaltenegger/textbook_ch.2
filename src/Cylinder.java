/**
 * @class: Cylinder
 * @author: Jan Kaltenegger
 * @version: 1.0
 * Course: ITEC 2140 - 04
 * Written: February 07, 2023
 * Description: This class calculates the volume of a cylinder and area of the base of a cylinder
 * given its length and radius of the base.
 */

import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius of your base circle: ");
        double radiusBase = in.nextDouble();
        System.out.println("Enter the length of your cylinder: ");
        double length = in.nextDouble();

        double pi = 3.1416;
        double areaBase = pi * radiusBase * radiusBase;
        double volume = pi * radiusBase* radiusBase * length;

        System.out.println("The area of the base of your cylinder is " + areaBase + " and the volume is " + volume + ".");
    }
}
