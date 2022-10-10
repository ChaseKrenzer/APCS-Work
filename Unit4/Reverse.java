public class Reverse
{
    public static void testReverse(String original, String expected)
    {
      String result = Reverse(original);

      System.out.print("String: " + original + "  Expected: " +
      expected + "  Result: " + result);

      if(result.equals(expected))
        System.out.println("  Output is: Correct!");
      else
        System.out.println("  Output is: Incorrect");
    }

    public static String Reverse(String original) {
      String back = "";
      int k = original.length();
      for (int i = 0; i < k; i ++){
        back += original.charAt((k - 1) - i);
      }
      return back;
    }

    public static void main(String[] args)
    {
      testReverse("bad", "dab");
      testReverse("Hello, world!", "!dlrow ,olleH");
      testReverse("tacocat", "tacocat");
      testReverse("Marlborough", "hguoroblraM");
      testReverse("12345", "54321");


    }
  }
