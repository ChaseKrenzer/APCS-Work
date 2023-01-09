/* a) Write a class Item, representing a single item you can buy at a store.
You should include: - private member variables for the name (String) and price
(float) of the item - a constructor that sets these member variables - public
accessor functions for the member variables

b) Write a class ItemCalculator that calculates various things about a list of
Item objects. Include these functions: - a function that takes an ArrayList of
Item objects as input, and prints the names and prices of the items in the list
(returns nothing) - a function that takes an ArrayList of Item objects as input,
and returns the average price of the items - a function that takes an ArrayList
of Item objects as input, and returns the name of the most expensive Item

c) Write unit tests for all ItemCalculator functions that return a value, to
demonstrate that the functions are working correctly. These tests can be written
in the ItemCalculator class, or in an external ItemCalculatorTest class. */

public class Item
{
    public Item(String name, float price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public float getPrice()
    {
        return price;
    }

    private String name;
    private float price;
}
