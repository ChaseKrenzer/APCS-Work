//(Re)write a String reverse(String s) function that returns the reverse of
//a single string. Then, using this reverse() function, write a function
//reverseAll() takes an array of Strings and returns a new array containing
//the same strings, but with each string reversed.

import java.util.*;
public class Transform
{
    public static void testTransform(ArrayList<String> s, ArrayList<String> expected)
    {
      ArrayList<String> result = Transform(s);
      System.out.print("Array: ");
      for (int i=0; i<s.size(); i++)
        {
            String num = s.get(i);
            System.out.print(num + ", ");
          }

      System.out.println("Expected: " + expected + "  Result: " + result);
      if(result.equals(expected))
        System.out.println("Output is: Correct!");
      else
        System.out.println("Output is: Incorrect");
          System.out.println( );
  }

    public static ArrayList<String> Transform(ArrayList<String> s) {
      ArrayList<String> reverse = new ArrayList<String>();
      for (int i = 0; i < s.size(); i ++){
        String back = "";
        String section = s.get(i);
        for (int c = 0; c < section.length(); c ++){
          back += section.charAt((section.length() - 1) - c);
      }
      reverse.add(back);
      }
      return reverse;
    }

    public static void main(String[] args)
    {

      ArrayList<String> s1 = new ArrayList<String>();
        s1.add("abcd");
        s1.add("xyz");

      ArrayList<String> s2 = new ArrayList<String>();
        s2.add("1234");
        s2.add("5678");

      ArrayList<String> s3 = new ArrayList<String>();
        s3.add("racecar");
        s3.add("tacocat");
        s3.add("izzi");

      ArrayList<String> s4 = new ArrayList<String>();
        s4.add("dcba");
        s4.add("zyx");

      ArrayList<String> s5 = new ArrayList<String>();
        s5.add("4321");
        s5.add("8765");

      ArrayList<String> s6 = new ArrayList<String>();
        s6.add("racecar");
        s6.add("tacocat");
        s6.add("izzi");

      testTransform(s1, s4);
      testTransform(s2, s5);
      testTransform(s3, s6);
    }

}
