public class Factorial
{
    public static void testFactorial(int number, int expected)
    {
      int result = Factorial(number);

      System.out.print("Number: " + number + "  Expected: " +
      expected + "  Result: " + result);

      if(result == expected)
        System.out.println("  Output is: Correct!");
      else
        System.out.println("  Output is: Incorrect");
    }

    public static int Factorial(int number) {
      int k = 1;
      if (number == 0)
        return 1;
      else {
        for (int i = 0; i < number; i ++){
          k *= i + 1;
        }
      }
      return k;
    }

    public static void main(String[] args)
    {
      testFactorial(0, 1);
      testFactorial(1, 1);
      testFactorial(2, 2);
      testFactorial(3, 6);
      testFactorial(4, 24);
      testFactorial(5, 120);
      testFactorial(6, 720);
      testFactorial(7, 5040);

    }
  }
