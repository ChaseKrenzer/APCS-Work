import java.util.*;
public class TestAcademicClass
{
  public static void main(String[] args)
      {
          ArrayList<Student> students = new ArrayList<Student>();

          AcademicClass aClass = new AcademicClass(new Teacher("Dr. Kessner", "APCS"), students);

          aClass.add("Riley", 42);
          aClass.add("Kailyn", 3);
          aClass.add("Chase", 4);

          for (Student s : students){
             System.out.println(s.getName() + " likes " + s.getFav() +
             " the best!");
           }

          System.out.println("Class Info: " );
              aClass.printInfo();
              System.out.println("");
          System.out.println("Students with Favorite Number 3: " + aClass.favNumber(3));
          System.out.println("Students with Odd Favorite Number: " + aClass.oddNumbers(students));
          }
}
