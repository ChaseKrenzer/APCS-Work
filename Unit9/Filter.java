//Write a function that takes an ArrayList of integer scores, and returns
//an ArrayList representing the scores over 90.

import java.util.*;
public class Filter
{
    public static void testFilter(ArrayList<Integer> nums, ArrayList<Integer> expected)
    {
      ArrayList<Integer> result = Filter(nums);
      System.out.print("Array: ");
      for (int i=0; i<nums.size(); i++)
        {
            double num = nums.get(i);
            System.out.print(num + ", ");
          }

      System.out.println("Expected: " + expected + "  Result: " + result);
      if(result.equals(expected))
        System.out.println("Output is: Correct!");
      else
        System.out.println("Output is: Incorrect");
          System.out.println( );
  }

    public static ArrayList<Integer> Filter(ArrayList<Integer> nums) {
      ArrayList<Integer> over90 = new ArrayList<Integer>();
      for (int i = 0; i < nums.size(); i ++){
        if(nums.get(i) > 90){
          over90.add(nums.get(i));
        }
      }
      return over90;
    }

    public static void main(String[] args)
    {
      ArrayList<Integer> nums1 = new ArrayList<Integer>();
        nums1.add(51);
        nums1.add(52);
        nums1.add(53);
        nums1.add(100);

      ArrayList<Integer> nums2 = new ArrayList<Integer>();
        nums2.add(92);
        nums2.add(89);
        nums2.add(90);
        nums2.add(99);

      ArrayList<Integer> nums3 = new ArrayList<Integer>();
        nums3.add(100);

      ArrayList<Integer> nums4 = new ArrayList<Integer>();
        nums4.add(92);
        nums4.add(99);

      testFilter(nums1, nums3);
      testFilter(nums2, nums4);


    }

}
