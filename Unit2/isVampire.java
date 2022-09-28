/* A person is a vampire if she is asleep during waking hours
(6:00 to 22:00), or awake during sleeping hours (before 6:00
or after 22:00). Write a class with a static function boolean
isVampire(float hour, boolean awake) where hour is the time
represented as a float (e.g. 6.5 means 6:30), and awake represents
whether the person is awake, returning true if that person is a
vampire. Be sure to write a unit test function and a few tests. */

  public class isVampire
  {
      public static void testisVampire(float hour, boolean awake, boolean expected)
      {
        boolean result = isVampire(hour, awake);

        System.out.print("Hour: " + hour + "  Awake " + awake + "  Expected: " +
        expected + "  Result: " + result);

        if (result == expected)
          System.out.println("  Output is: Correct!");
        else
          System.out.println("  Output is: Incorrect");
      }

      public static boolean isVampire(float hour, boolean awake) {
        if ((hour > 6 && hour < 22) && awake == false)
          return true;
        else if ((hour < 6 || hour > 22) && awake == true)
          return true;
        else
          return false;
      }

      public static void main(String[] args)
      {
        testisVampire(7, true, false);
        testisVampire(23, true, true);
        testisVampire(11, false, true);
        testisVampire(4, false, false);

      }
    }
