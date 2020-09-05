/*
Name: Brian Chan
CptS 233: MicroAssignment #1
Date: 9/4/2020
gitRepo url: https://github.com/brianhk200/CptS_233_MA1.git
 */
class RoomCarpet
   {
      RoomDimension size;
      double carpetCost;
      public RoomCarpet(RoomDimension dim, double cost)
      {
         size = new RoomDimension(dim.getLength(), dim.getWidth());
         carpetCost = cost;
         }
      public double getTotalCost()
      {
         return carpetCost;
         }
      public String toString()
      {
         String result = size + "\nCarpet cost: $" + carpetCost * size.getArea();
         return result;
         }
   }