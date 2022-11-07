//A number is lucky if it is a multiple of 7 or ends in 7. Write a function
//that counts the number of lucky numbers in an ArrayList of integers.
import java.util.*;
public class CountLucky2
{
    public static void testCountLucky2(ArrayList<Integer> nums, int expected)
    {
      int result = CountLucky2(nums);
      System.out.print("Array: ");
      for (int i=0; i<nums.size(); i++)
        {
            int num = nums.get(i);
            System.out.print(num + ", ");
          }

      System.out.println("Expected: " + expected + "  Result: " + result);
      if(result == expected)
        System.out.println("Output is: Correct!");
      else
        System.out.println("Output is: Incorrect");
          System.out.println( );
  }

    public static int CountLucky2(ArrayList<Integer> nums) {
      int total = 0;
      for (int i = 0; i < nums.size(); i ++){
        int n = nums.get(i);
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
      ArrayList<Integer> nums1 = new ArrayList<Integer>();
        nums1.add(1);
        nums1.add(2);
        nums1.add(3);
      ArrayList<Integer> nums2 = new ArrayList<Integer>();
        nums2.add(7);
        nums2.add(13);
        nums2.add(17);
      ArrayList<Integer> nums3 = new ArrayList<Integer>();
        nums3.add(107);
        nums3.add(207);

      testCountLucky2(nums1, 0);
      testCountLucky2(nums2, 2);
      testCountLucky2(nums3, 2);

    }

}
