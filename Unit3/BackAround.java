public class BackAround
{
    public static void testBackAround(String str, String expected)
    {
      String result = BackAround(str);

      System.out.print("String: " + str + "  Expected: " +
      expected + "  Result: " + result);

      if (result.equals(expected))
        System.out.println("  Output is: Correct!");
      else
        System.out.println("  Output is: Incorrect");
    }

    public static String BackAround(String str) {
      String lchar = str.substring(str.length() - 1);
          return lchar + str + lchar;
    }

    public static void main(String[] args)
    {
      testBackAround("cat", "tcatt");
      testBackAround("Hello", "oHelloo");
      testBackAround("a", "aaa");

    }
  }
