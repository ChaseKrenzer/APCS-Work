/* Attention. Write a function attention() that takes a single
String as input and returns true if the string starts with
“Hey, you!”. Be sure to include unit tests. */

public class Attention
{
    public static void testAttention(String str, boolean expected)
    {
      boolean result = Attention(str);

      System.out.print("String: " + str + "  Expected: " +
      expected + "  Result: " + result);

      if (result == expected)
        System.out.println("  Output is: Correct!");
      else
        System.out.println("  Output is: Incorrect");
    }

    public static boolean Attention(String str) {
        String hey = new String("Hey, you!");
            if (str.length() < 9)
                return false;
            else if (hey.equals(str.substring(0,9)))
                return true;
            else
                return false;
      }

    public static void main(String[] args)
    {
      testAttention("Hello, my name is Inigo Montoya.", false);
      testAttention("Excuse me, Dr. Kessner?", false);
      testAttention("Hey, you! Give me your code!", true);
    }
  }
