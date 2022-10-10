public class StringMatch
{
    public static void testStringMatch(String a, String b, int expected)
    {
      int result = StringMatch(a, b);

      System.out.print("String A: " + a + "String B: " + b + "  Expected: " +
      expected + "  Result: " + result);

      if (expected == result)
        System.out.println("  Output is: Correct!");
      else
        System.out.println("  Output is: Incorrect");
    }

    public static int StringMatch(String a, String b) {
      int all = 0;
      int f = 0;
        if(a.length() > b.length())
          f = b.length();
        else if(a.length() < b.length())
          f = a.length();
        else
          f = a.length();
      for (int i = 0; i < f - 1; i++){
          if (a.charAt(i) == b.charAt(i) && a.charAt(i + 1) == b.charAt(i + 1))
            all += 1;
          else
            continue;
  }
    return all;
}

    public static void main(String[] args)
    {
      testStringMatch("xxcaazz", "xxbaaz", 3);
      testStringMatch("abc", "abc", 2);
      testStringMatch("abc", "axc", 0);

    }
  }
