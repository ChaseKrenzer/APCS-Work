public class U1Assignment
{
    public static void main(String[] args)
    {


// Multiples of 3
System.out.println("Multiples of 3");
System.out.println();
 for (int i = 0; i < 30; i++){
   if (i%3 == 0)
    System.out.println(i);
 }

System.out.println();
System.out.println();

// FizzBuzz (up to 30)
System.out.println("Fizz Buzz");
System.out.println();
for (int i = 1; i < 30; i++){
  if (i%15 == 0){
    System.out.println("FizzBuzz!");
  }
  else if (i%5 == 0){
    System.out.println("Buzz");
  }

  else if (i%3 ==0){
    System.out.println("Fizz");
  }
  else
    System.out.println(i);

}
System.out.println();
System.out.println();

//Geonmetric Sequence
System.out.println("Geometric Sequence");
System.out.println();
for (int i = 0; i < 16; i++){
  System.out.println(i);
}

System.out.println();
System.out.println();

// Cubes
System.out.println("Cubes");
System.out.println();
for (int i = 0; i < 15; i++){
  if (i = 0)
    System.out.println("0");
  else {
  for (int x = 1, x < 226; x++){
    if (x%i == 0)
      System.out.println("x")
  }
  }
}



// Fibbonacci Sequence

    }
}
