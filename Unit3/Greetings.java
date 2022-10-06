/* Write a function greetings() that takes a single String name
and returns returns a greeting using the given name. Be sure to
include unit tests. */

public class Greetings
{
    public static void testGreetings(String name, String expected)
    {
      String result = Greetings(name);

      System.out.print("Name: " + name + "  Expected: " +
      expected + "  Result: " + result);

      if (result.equals(expected))
        System.out.println("  Output is: Correct!");
      else
        System.out.println("  Output is: Incorrect");
    }

    public static String Greetings(String name) {
        String greeting = "Hello , how is your day going?";
        return greeting.substring(0, 6) + name + greeting.substring(6, 30);


    }

    public static void main(String[] args)
    {
      testGreetings("Chase", "Hello Chase, how is your day going?");
      testGreetings("Riley", "Hello Riley, how is your day going?");
      testGreetings("Dr. Kessner", "Hello Dr. Kessner, how is your day going?");

    }
  }
