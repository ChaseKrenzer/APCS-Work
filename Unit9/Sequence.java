//Write a function that takes a single integer n and returns an array of
//integers containing the first n terms of the Fibonacci sequence.

import java.util.*;
public class Sequence
{
    public static void testSequence(int num, ArrayList<Integer> expected)
    {
      ArrayList<Integer> result = Sequence(num);
      System.out.print("Number: " + num);

      System.out.println("Expected: " + expected + "  Result: " + result);
      if(result.equals(expected))
        System.out.println("Output is: Correct!");
      else
        System.out.println("Output is: Incorrect");
          System.out.println( );
  }

    public static ArrayList<Integer> Sequence(int num) {
      ArrayList<Integer> list = new ArrayList<Integer>();
      int a = 1;
      int b = 1;
      list.add(a);
      list.add(b);
      for (int i = 0; i < num-2; i++){
        if(i%2 == 0) {
          list.add(a + b);
          a = a + b;
        }
        if(i%2 != 0){
          list.add(a + b);
          b = a + b;
        }
    }
    return list;
  }

    public static void main(String[] args)
    {
      ArrayList<Integer> nums1 = new ArrayList<Integer>();
        nums1.add(1);
        nums1.add(1);
      ArrayList<Integer> nums2 = new ArrayList<Integer>();
        nums2.add(1);
        nums2.add(1);
        nums2.add(2);
      ArrayList<Integer> nums3 = new ArrayList<Integer>();
        nums3.add(1);
        nums3.add(1);
        nums3.add(2);
        nums3.add(3);
      ArrayList<Integer> nums4 = new ArrayList<Integer>();
        nums4.add(1);
        nums4.add(1);
        nums4.add(2);
        nums4.add(3);
        nums4.add(5);

      testSequence(2, nums1);
      testSequence(3, nums2);
      testSequence(4, nums3);
      testSequence(5, nums4);


    }

}
