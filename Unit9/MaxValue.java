//Write a function that takes an array of double values as input and returns
//the maximum value. Write unit tests for this one.
import java.util.*;
public class MaxValue
{
    public static void testMaxValue(ArrayList<Double> nums, double expected)
    {
      double result = MaxValue(nums);
      System.out.print("Array: ");
      for (int i=0; i<nums.size(); i++)
        {
            double num = nums.get(i);
            System.out.print(num + ", ");
          }

      System.out.println("Expected: " + expected + "  Result: " + result);
      if(result == expected)
        System.out.println("Output is: Correct!");
      else
        System.out.println("Output is: Incorrect");
          System.out.println( );
  }

    public static double MaxValue(ArrayList<Double> nums) {
      double max = nums.get(0);
      for (int i = 0; i < nums.size(); i ++){
        if(nums.get(i) >= max){
          max = nums.get(i);
        }
      }
      return max;
    }

    public static void main(String[] args)
    {
      ArrayList<Double> nums1 = new ArrayList<Double>();
        nums1.add(1.0);
        nums1.add(2.1);
        nums1.add(5.3);
      ArrayList<Double> nums2 = new ArrayList<Double>();
        nums2.add(0.0);
        nums2.add(-35.0);
        nums2.add(90.1);

      testMaxValue(nums1, 5.3);
      testMaxValue(nums2, 90.1);


    }

}
