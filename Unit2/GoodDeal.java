/* A store has marked down the prices of many items,
but you only want to buy something if the discount is
more than 25% (or in other words, the sale price is
< 75% of the original price). Write a function boolean
goodDeal(double originalPrice, double salePrice) that
returns true if you’re getting a good deal on the item.
Be sure to write a test function and several tests. */


public class GoodDeal
{
    public static void testGoodDeal(double originalPrice, double salePrice, boolean expected)
    {
      boolean result = GoodDeal(originalPrice, salePrice);

      System.out.print("Original Price " + originalPrice + "  Sale Price " + salePrice + "  Expected: " +
      expected + "  Result: " + result);

      if (result == expected)
        System.out.println("  Output is: Correct!");
      else
        System.out.println("  Output is: Incorrect");
    }

    public static boolean GoodDeal(double originalPrice, double salePrice) {
      if (salePrice <= (originalPrice * 0.75))
        return true;
      else
        return false;
    }

    public static void main(String[] args)
    {
      testGoodDeal(100, 75, true);
      testGoodDeal(70, 55, false);
      testGoodDeal(100, 90, false);
      testGoodDeal(50, 20, true);

    }
  }
