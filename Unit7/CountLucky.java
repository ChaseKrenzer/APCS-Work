//A number is lucky if it is a multiple of 7 or ends in 7. Write a function
//that counts the number of lucky numbers in an array of integers.

public class CountLucky
{
    public static void testCountLucky(int[] nums, int expected)
    {
      int result = CountLucky(nums);
      System.out.print("Array: ");
      for (int i=0; i<nums.length; i++)
        {
            int num = nums[i];
            System.out.print(num + ", ");
          }

      System.out.println("Expected: " + expected + "  Result: " + result);
      if(result == expected)
        System.out.println("Output is: Correct!");
      else
        System.out.println("Output is: Incorrect");
          System.out.println( );
  }

    public static int CountLucky(int[] nums) {
      int total = 0;
      for (int i = 0; i < nums.length; i ++){
        int n = nums[i];
        if(n % 7 == 0){
          total += 1;
        }

        else if(n % 10 == 7) {
          total += 1;
        }
      }
      return total;
    }

    public static void main(String[] args)
    {

      int[] nums1 = new int[]{1, 2, 3};
      int[] nums2 = new int[] {7, 13, 17};
      int[] nums3 = new int[] {107, 207};


      testCountLucky(nums1, 0);
      testCountLucky(nums2, 2);
      testCountLucky(nums3, 2);

    }

}
