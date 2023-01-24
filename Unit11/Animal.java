/* Write a class Animal. You should include:
- private member variables for the  name (String), leg count (int), furriness
(boolean)
- a constructor that sets these member variables
- public accessor functions for the member variables

Write four subclasses of Animal (for example: Human, Cat, Sponge, Centipede).
Note that your subclass constructors will need to call the Animal constructor
using super().

Write some test code to show your subclasses all behave properly.

Write a class AnimalCalculator that calculates various things about a list of
Animal objects. Include these functions:

- a function that takes an ArrayList of Animal objects as input, and prints the
name, number of legs, and “furry” or “not furry” (returns nothing)

- a function that takes an ArrayList of Animal objects as input, and returns
the average number of legs

- a function that takes an ArrayList of Animal objects as input, and returns
the Animal object with the fewest legs

Write unit tests for all AnimalCalculator functions that return a value, to
demonstrate that the functions are working correctly. These tests can be written
in the AnimalCalculator class, or in an external AnimalCalculatorTest class. */

public class Animal
{
    public Animal(String name, int legCount, boolean furry)
    {
        this.name = name;
        this.legCount = legCount;
        this.furry = furry;
    }

    public String name()
    {
        return name;
    }

    public int legCount()
    {
        return legCount;
    }

    public boolean furry()
    {
        return furry;
    }

    private String name;
    private int legCount;
    private boolean furry;
}
