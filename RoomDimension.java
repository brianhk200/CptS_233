/*
Name: Brian Chan
CptS 233: MicroAssignment #1
Date: 9/4/2020
gitRepo url: https://github.com/brianhk200/CptS_233_MA1.git
 */
import java.util.*;

class RoomDimension
{
   double length;
   double width;
   public RoomDimension(double l, double w)
   {
      length = l;
      width = w;
   }
   public double getLength()
   {
      return length;
   }
   public double getWidth()
   {
      return width;
   }
   public double getArea()
   {
      return length * width;  //get area by multiply
   }
public String toString()
   {
      String result;
      result = "Room dimensions:\nLength: " + length + "\tWidth: " + width + "\tArea: " + getArea();
      return result;
   }
}
