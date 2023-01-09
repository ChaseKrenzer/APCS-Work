/* b) Write a class PersonStats that calculates various things about lists of
Person objects. Include three functions: - a function that takes an ArrayList
of Person objects, and calculates the average number of pets - a function that
takes an ArrayList of Person objects, and returns the name of the person with
the most pets - a function that takes an ArrayList of Person objects, and
returns an ArrayList of Person objects representing those people who have at
least 2 pets.

c) Write unit tests for all PersonStats functions that return a value, to
demonstrate that the functions are working correctly. These tests can be written
in PersonStats, or in an external PersonStatsTest class. */


import java.util.*;

public class PersonStats
{

    public static int PetsAvg(ArrayList <Person> people){
      int total = 0;
      for (int i=0; i<people.size(); i++){
          Person p = people.get(i);
          total += p.getPets();
        }
        return total / people.size();
  }


    public static String MostPets(ArrayList <Person> people){
      String most = "";
      int highest = 0;
      for (int i=0; i<people.size(); i++) {
        Person p = people.get(i);
        if (p.getPets() > highest){
          highest = p.getPets();
          most = p.getName();
        }
      }
      return most;
    }

    public static String TwoPlus(ArrayList <Person> people){
      String all = "";
      for (int i=0; i<people.size(); i++) {
        Person p = people.get(i);
        if (p.getPets() > 2){
          all += p.getName() + ", ";
        }
      }
      return all;
    }

    public static void main(String[] args)
      {
          ArrayList<Person> people = new ArrayList<Person>();

          Person p1 = new Person("Sally", 12);
          people.add(p1);

          Person p2 = new Person("Chase", 3);
          people.add(p2);

          Person p3 = new Person("Riley", 1);
          people.add(p3);

          for (Person p : people)
            System.out.println(p.getName() + " has " + p.getPets() + " pets. ");

            System.out.println("Average Pets: " + PetsAvg(people));

            System.out.println("Most Pets: " + MostPets(people));

            System.out.println("People with two or more pets: " +
            TwoPlus(people));
        }
}
