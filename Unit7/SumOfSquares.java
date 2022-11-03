//Write a function that takes a single array of doubles as input,
//and returns the sum of squares of the values.

public class SumOfSquares
{
    public static void testSumOfSquares(double[] nums, double expected)
    {
      double result = SumOfSquares(nums);

      System.out.print("Array: ");
      for (int i=0; i<nums.length; i++)
        {
            double num = nums[i];
            System.out.print(num + ", ");
          }
      System.out.println("Expected: " + expected + "  Result: " + result);
      if(result == expected)
        System.out.println("Output is: Correct!");
      else
        System.out.println("Output is: Incorrect");
      System.out.println( );
    }

    public static double SumOfSquares(double[] nums) {
      double k = 0;
      for (int i = 0; i < nums.length; i ++){
        k += nums[i] * nums[i];
      }
      return k;
    }

    public static void main(String[] args)
      {

        double[] nums1 = new double[] {0};
        double[] nums2 = new double[] {1.0, 2.0, 3.0};
        double[] nums3 = new double[] {2.0, 2.0, 2.0};


        testSumOfSquares(nums1, 0);
        testSumOfSquares(nums2, 14.0);
        testSumOfSquares(nums3, 12.0);

        }

    }
