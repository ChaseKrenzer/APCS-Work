/* a) Write a function that takes a 2D array of integers as input and returns
the smallest.

b) Write a function that calculates the sum of a 2D array of floats.

c) Write a function that takes a 2D array of Strings as input, and counts the
number of strings that start with the letter “A”.
*/

public class Computations{

public static int smallestInt(int[][] intArray){
  int smallest = intArray[0][0];
  for (int i=0; i<intArray.length; i++)
  {
      for (int j=0; j<intArray[i].length; j++)
      {
        if (intArray[i][j] < smallest)
          smallest = intArray[i][j];
      }
  }
  return smallest;
}

public static float sumOfArray(float[][] floatArray){
  float sum = 0;
  for (int i=0; i<floatArray.length; i++)
  {
      for (int j=0; j<floatArray[i].length; j++)
      {
        sum += floatArray[i][j];
      }
  }
  return sum;
}

public static int startWithA(String[][] stringArray){
  int number = 0;
  String a = "a";
  String A = "A";
  for (int i=0; i<stringArray.length; i++)
  {
      for (int j=0; j<stringArray[i].length; j++)
      {
        if (a.equals(stringArray[i][j].substring(0,1)) || A.equals(stringArray[i][j].substring(0,1)))
          number ++;
      }
  }
  return number;
}

public static void main(String[] args)
{
  int[][] intArray = { {9, 8, 7}, {1, 2, 3}, {6, 5, 4} };
  float[][] floatArray = { {9, 8, 7}, {1, 2, 3}, {6, 5, 4} };
  String[][] stringArray = { {"Cherry", "Apple", "Pear"}, {"aaA", "bbB", "ccC"},
                                          {"Cat", "Dog", "Alpaca"} };
int intResult = smallestInt(intArray);
System.out.println("");
for (int i=0; i<3; i++)
  {
    for (int j=0; j < 3; j++)
      {
        System.out.print(intArray[i][j] + " ");
        }
        System.out.println();
    }
System.out.println("Smallest int in the array: ");
System.out.println(intResult);
System.out.println("");

for (int i=0; i<3; i++)
  {
    for (int j=0; j < 3; j++)
      {
        System.out.print(floatArray[i][j] + " ");
        }
        System.out.println();
    }
System.out.println("Sum of array: ");
float floatResult = sumOfArray(floatArray);
System.out.println(floatResult);
System.out.println("");

for (int i=0; i<3; i++)
  {
    for (int j=0; j < 3; j++)
      {
        System.out.print(stringArray[i][j] + " ");
        }
        System.out.println();
    }
System.out.println("Number of strings that start with A: ");
int stringResult = startWithA(stringArray);
System.out.println(stringResult);

}

}
