public class Diff21
{

    public static void testDiff21(int n, int expected)
    {
      int result = diff21(n);

      System.out.print("N is:  " + n +  "  Expected: " +
      expected + "  Result:  " + result);

      if (result == expected)
        System.out.println("  Output is: Correct!");
      else
        System.out.println("  Output is: Incorrect");
    }

    public static int diff21(int n) {
        if ( n <= 21){
          return 21 - n;
        }
        else {
          return 2 * (n - 21);
        }
      }

    public static void main(String[] args)
    {
      testDiff21(19, 2);
      testDiff21(10, 11);
      testDiff21(21, 0);
      testDiff21(22, 2);

    }
  }
