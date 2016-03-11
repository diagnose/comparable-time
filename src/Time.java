/*
 * AP CS MOOC
 * Term 2 - Assignment 4: Time Comparable
 * You can use this solution to Assignment 1 in order to create a comparable time object.
 * You will need to change the class so that it implements the comparable interface.
 */

public class Time
{
     private int hour;
     private int minute;
    
    /*
     * Sets the default time to 12:00.
     */
    public Time ()
    {
         this(12, 0);
    }
    
    /*
     * Sets hour to h and minute to m.
     */
    public Time (int h, int m)
    {
         hour = 0;
         minute = 0;
         if (h >=1 && h <= 23)
              hour = h;
         if (m >= 1 && m <= 59)
              minute = m;
            
    }
    
    /*
     * Returns the time as a String of length 4 in the format: 0819.
     */
     public String toString ()
     {
          
          String h = "";
          String m = "";
          if ( hour <10)
               h +="0";
          if (minute <10)
               m +="0";
          h += hour;
          m+=minute;
          
          return "" + h + "" + m;
     }
}