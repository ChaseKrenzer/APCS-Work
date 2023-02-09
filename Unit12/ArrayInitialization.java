/* a) Declare and initialize a 10x10 array of integers with 1 on the diagonal
(i.e. where i == j) and 0 everywhere else.

b) Declare and initialize a 2D array of Strings (any size).

c) Declare and initialize a 5x5 array of doubles with the following values.
You must use a loop.

    11.0  12.0  13.0  14.0  15.0
    21.0  22.0  23.0  24.0  25.0
    31.0  32.0  33.0  34.0  35.0
    41.0  42.0  43.0  44.0  45.0
    51.0  52.0  53.0  54.0  55.0
d) Declare and initialize a 6x5 array of integers with the following values.
You must use a loop.

    1 1 1 1 1
    2 2 2 2 2
    3 3 3 3 3
    4 4 4 4 4
    5 5 5 5 5
    6 6 6 6 6
*/

public class ArrayInitialization {

public static void main(String[] args)
{

//part a
int[][] ints = new int[10][10];
for (int i=0; i<10; i++)
{
    for (int j=0; j<10; j++)
    {
      if (i == j)
        ints[i][j] = 1;
      else
        ints[i][j] = 0;
    }
}
//part b
String[][] strings = new String[4][4];

//part c
double[][] doubles = new double[5][5];

for (int i=0; i<5; i++)
{
  int k = 0;
  for (int j=0; j<5; j++)
    {
      doubles[i][j] = (i * 10) + 11 + k;
      k ++;
    }
}
//part default:
int[][] newInts = new int[6][5];

int k = 1;
for (int i=0; i<6; i++)
{
  for (int j=0; j<5; j++)
    {
      newInts[i][j] = k;
    }
    k++;
}
System.out.println("");
System.out.println("Diagonal int array: ");

for (int[] row : ints)
    {
    for (int value : row)
    {
    System.out.print(value + " ");
    }
    System.out.println();
    }
System.out.println("");
System.out.println("Double int array: ");
for (int i=0; i<5; i++)
  {
    for (int j=0; j < 5; j++)
      {
        System.out.print(doubles[i][j] + " ");
        }
        System.out.println();
  }
System.out.println("");
System.out.println("Int array: ");
for (int i=0; i<6; i++)
  {
    for (int j=0; j < 5; j++)
      {
        System.out.print(newInts[i][j] + " ");
        }
        System.out.println();
    }

}
}
