public class Fibonacci
{
    public static void main(String[] args)
    {
int a = 1;
int b = 1;
System.out.println(a);
System.out.println(b);
for (int i = 0; i < 30; i++){
  if(i%2 == 0) {
    System.out.println(a + b);
    a = a + b;
  }
  if(i%2 != 0){
    System.out.println(a + b);
    b = a + b;
  }
  }

}
}
