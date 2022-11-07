//Write a function that takes an ArrayList of doubles as input,
//and returns the sum of squares of the values.
import java.util.*;
public class SumOfSquares2
{
    public static void testSumOfSquares2(ArrayList<Double> nums, double expected)
    {
      double result = SumOfSquares2(nums);

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

    public static double SumOfSquares2(ArrayList<Double> nums) {
      double k = 0;
      for (int i = 0; i < nums.size(); i ++){
        k += nums.get(i) * nums.get(i);
      }
      return k;
    }

    public static void main(String[] args)
      {
        ArrayList<Double> nums1 = new ArrayList<Double>();
          nums1.add(0.0);
        ArrayList<Double> nums2 = new ArrayList<Double>();
          nums2.add(1.0);
          nums2.add(2.0);
          nums2.add(3.0);
        ArrayList<Double> nums3 = new ArrayList<Double>();
          nums3.add(2.0);
          nums3.add(2.0);
          nums3.add(2.0);

        testSumOfSquares2(nums1, 0);
        testSumOfSquares2(nums2, 14.0);
        testSumOfSquares2(nums3, 12.0);

        }

    }
