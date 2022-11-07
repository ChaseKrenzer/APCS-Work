//Write a function that takes an ArrayList of strings as input, and returns the
//total length of the strings that start with “z” or “Z”.

import java.util.*;
public class TotalLength2
{
    public static void testTotalLength2(ArrayList<String> nums, int expected)
    {
      int result = TotalLength2(nums);

      System.out.print("Array: ");
      for (int i=0; i<nums.size(); i++)
        {
            String num = nums.get(i);
            System.out.print(num + ", ");
          }

      System.out.println("Expected: " + expected + "  Result: " + result);
      if(result == expected)
        System.out.println("Output is: Correct!");
      else
        System.out.println("Output is: Incorrect");
          System.out.println( );
    }

    public static int TotalLength2(ArrayList<String> nums) {
      int total = 0;
      for (int i = 0; i < nums.size(); i ++){
        String section = nums.get(i);
        String z = "z";
        String Z = "Z";
        if (z.equals(section.substring(0,1)) || Z.equals(section.substring(0,1)))
            total += section.length();
      }
      return total;
    }

    public static void main(String[] args)
    {
      ArrayList<String> nums1 = new ArrayList<String>();
        nums1.add("Dr. Kessner");
        nums1.add("Dr. Sands");
      ArrayList<String> nums2 = new ArrayList<String>();
        nums2.add("Zorro");
        nums2.add("Zero");
        nums2.add("zippy");

      testTotalLength2(nums1, 0);
      testTotalLength2(nums2, 14);


    }
  }
