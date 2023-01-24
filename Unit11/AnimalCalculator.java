/* Write a class AnimalCalculator that calculates various things about a list of
Animal objects. Include these functions:

- a function that takes an ArrayList of Animal objects as input, and prints the
name, number of legs, and “furry” or “not furry” (returns nothing)

- a function that takes an ArrayList of Animal objects as input, and returns
the average number of legs

- a function that takes an ArrayList of Animal objects as input, and returns
the Animal object with the fewest legs */
import java.util.*;

public class AnimalCalculator{

    public static void info (ArrayList <Animal> animals){
      for (Animal a : animals)
         System.out.println(a.name() + " has " + a.legCount() +
         " legs. Furry: " + a.furry());

    }

    public static int avgLegs (ArrayList <Animal> animals){
      int i = 0;
      for (Animal a : animals)
        i += a.legCount();

      return i / animals.size();

    }

    public static int fewestLegs (ArrayList <Animal> animals){
      int i = 2000;
      for (Animal a : animals){
        if (a.legCount() <= i)
            i = a.legCount();
      }
      return i;
    }

    public static void main(String[] args)
      {
          ArrayList<Animal> animals = new ArrayList<Animal>();

          Human h1 = new Human ("Human", 2, false);
          animals.add(h1);

          Cat c1 = new Cat ("Cat", 4, true);
          animals.add(c1);

          Fish f1 = new Fish ("Fish", 0, false);
          animals.add(f1);

          Bear b1 = new Bear ("Bear", 4, true);
          animals.add(b1);

        System.out.println("Animal Info: ");
                          info(animals);
        System.out.println("Average legs: "
            + avgLegs(animals) +  "; Fewest legs: "
            + fewestLegs(animals) + ". ");

        }



}
