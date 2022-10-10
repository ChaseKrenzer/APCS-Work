public class StringSplosion
{
    public static void testStringSplosion(String str, String expected)
    {
      String result = StringSplosion(str);

      System.out.print("String: " + str + "  Expected: " +
      expected + "  Result: " + result);

      if (result.equals(expected))
        System.out.println("  Output is: Correct!");
      else
        System.out.println("  Output is: Incorrect");
    }

    public static String StringSplosion(String str) {
      String s = "";
        for (int i = 0; i < str.length() + 1; i ++){
            s += str.substring(0, i);
          }
            return s;
    }

    public static void main(String[] args)
    {
      testStringSplosion("Code", "CCoCodCode");
      testStringSplosion("abc", "aababc");
      testStringSplosion("ab", "aab");
    }
  }
