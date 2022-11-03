//Write a function that takes an array of strings as input, and returns the
//total length of the strings that start with “z” or “Z”.

public class TotalLength
{
    public static void testTotalLength(String[] nums, int expected)
    {
      int result = TotalLength(nums);

      System.out.print("Array: ");
      for (int i=0; i<nums.length; i++)
        {
            String num = nums[i];
            System.out.print(num + ", ");
          }

      System.out.println("Expected: " + expected + "  Result: " + result);
      if(result == expected)
        System.out.println("Output is: Correct!");
      else
        System.out.println("Output is: Incorrect");
          System.out.println( );
    }

    public static int TotalLength(String[] nums) {
      int total = 0;
      for (int i = 0; i < nums.length; i ++){
        String section = nums[i];
        String z = "z";
        String Z = "Z";
        if (z.equals(section.substring(0,1)) || Z.equals(section.substring(0,1)))
            total += section.length();
      }
      return total;
    }

    public static void main(String[] args)
    {

      String[] nums1 = new String[]{"Dr. Kessner", "Dr. Sands"};
      String[] nums2 = new String[]{"Zorro", "zero", "zippy"};

      testTotalLength(nums1, 0);
      testTotalLength(nums2, 14);


    }
  }
