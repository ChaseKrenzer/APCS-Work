public class StartHi
{
    public static void testStartHi(String str, boolean expected)
    {
      boolean result = StartHi(str);

      System.out.print("String: " + str + "  Expected: " +
      expected + "  Result: " + result);

      if (result == expected)
        System.out.println("  Output is: Correct!");
      else
        System.out.println("  Output is: Incorrect");
    }

    public static boolean StartHi(String str) {
        String hi = new String("hi");
            if (str.length() < 2)
                return false;
            else if (hi.equals(str.substring(0,2)))
                return true;
            else
                return false;
      }

    public static void main(String[] args)
    {
      testStartHi("hi there", true);
      testStartHi("hi", true);
      testStartHi("hello hi", false);

    }
  }
