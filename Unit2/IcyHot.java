public class IcyHot
{
    public static void testIcyHot(int temp1, int temp2, boolean expected)
    {
      boolean result = IcyHot(temp1, temp2);

      System.out.print("Temp 1: " + temp1 + "  Temp 2: " + temp2 + "  Expected: " +
      expected + "  Result: " + result);

      if (result == expected)
        System.out.println("  Output is: Correct!");
      else
        System.out.println("  Output is: Incorrect");
    }

    public static boolean IcyHot(int temp1, int temp2) {
      if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 & temp2 < 0))
          return true;
      else
          return false;
}

    public static void main(String[] args)
    {
      testIcyHot(120, -1, true);
      testIcyHot(-1, 120, true);
      testIcyHot(2, 120, false);
      testIcyHot(-1, 100, false);

    }
  }
