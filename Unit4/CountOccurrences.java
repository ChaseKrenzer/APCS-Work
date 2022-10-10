public class CountOccurrences
{
    public static void testCountOccurrences(String original, String section, int expected)
    {
      int result = CountOccurrences(original, section);

      System.out.print("String: " + original + "  Occurence: " + section + "  Expected: " +
      expected + "  Result: " + result);
      if(result == expected)
        System.out.println("  Output is: Correct!");
      else
        System.out.println("  Output is: Incorrect");
    }

    public static int CountOccurrences(String original, String section) {
      int k = 0;
      int s = section.length();
      for (int i = 0; i < (original.length() - (s - 1)); i ++){
        if (section.equals(original.substring(i, (i + s))))
            k += 1;
      }
      return k;
    }

    public static void main(String[] args)
    {
      testCountOccurrences("Mississippi", "iss", 2);
      testCountOccurrences("banananana", "na", 4);
      testCountOccurrences("Marlborough", "rough", 1);
      testCountOccurrences("Wednesdaynesday", "nes", 2);

    }
  }
