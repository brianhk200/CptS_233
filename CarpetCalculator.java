/*
Name: Brian Chan
CptS 233: MicroAssignment #1
Date: 9/4/2020
gitRepo url: https://github.com/brianhk200/CptS_233_MA1.git
 */
import java.util.Scanner;

public class CarpetCalculator
   {
      public static void main(String[] args)
         {
            final double CARPET_PRICE = 8.0; //set a fixed price for the carpet
            double length; 
            double width; 
            RoomDimension dimensions; 
            RoomCarpet room; 

            Scanner keyboard = new Scanner(System.in);
  
            System.out.println("This is a carpet calculator");
            
            System.out.print("Please enter the length: ");  //get length from user
            length = keyboard.nextDouble();
  
            System.out.print("Please enter the width: ");   //get width from user
            width = keyboard.nextDouble();
  
            dimensions = new RoomDimension(length, width);  //import data to the program
            room = new RoomCarpet(dimensions, CARPET_PRICE);
  
            System.out.println(room);     //print out the result
            }
}