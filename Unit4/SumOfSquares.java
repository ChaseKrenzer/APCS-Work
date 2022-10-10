public class SumOfSquares
{
    public static void testSumOfSquares(int n, int expected)
    {
      int result = SumOfSquares(n);

      System.out.print("Number: " + n + "  Expected: " +
      expected + "  Result: " + result);

      if(result == expected)
        System.out.println("  Output is: Correct!");
      else
        System.out.println("  Output is: Incorrect");
    }

    public static int SumOfSquares(int n) {
        int k = 0;
        for(int i = 0; i < n; i ++){
          k += Math.pow(i + 1, 2);
        }
        return k;
    }

    public static void main(String[] args)
    {
      testSumOfSquares(1, 1);
      testSumOfSquares(2, 5);
      testSumOfSquares(3, 14);
      testSumOfSquares(4, 30);
      testSumOfSquares(5, 55);

    }
  }
