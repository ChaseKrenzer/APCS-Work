/* c) Write a class AcademicClass, representing a course you take in school.
The AcademicClass should have a private variable for the teacher, and a private
ArrayList of students. Either include the teacher in the constructor or write a
setTeacher() function. Also include the following:

-a function to add a student to the list

-a function that prints info about the class (i.e print the teacher and all
student names.

-a function that takes a single integer n as input and returns an ArrayList of
the names of the students whose favorite number is n

-a function that returns an ArrayList of the names of the students whose
favorite number is odd */
import java.util.*;
public class AcademicClass
{
  public AcademicClass(Teacher teacher, ArrayList<Student> students)
    {
        this.teacher = teacher;
        this.students = students;
    }

  public void add(String name, int fav)
        {
            Student student = new Student(name, fav);
            students.add(student);
        }

  public void printInfo()
      {
        System.out.print("Teacher: " + teacher + ". List of Students: " );
        for (Student s : students)
            System.out.print(s + ", ");

      }

  public ArrayList<Student> favNumber(int n)
  {
    ArrayList<Student> result = new ArrayList<Student>();
    for (Student s : students){
      if (s.getFav() == n)
          result.add(s);
        }
    return result;
  }

  public ArrayList<Student> oddNumbers(ArrayList<Student> students)
  {
    ArrayList<Student> result = new ArrayList<Student>();
    for (Student s : students){
      if (s.getFav()% 2 != 0)
          result.add(s);
        }
    return result;
  }

private Teacher teacher;
private ArrayList<Student> students;
private int n;
}
