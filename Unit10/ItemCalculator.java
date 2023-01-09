/* b) Write a class ItemCalculator that calculates various things about a list of
Item objects. Include these functions: - a function that takes an ArrayList of
Item objects as input, and prints the names and prices of the items in the list
(returns nothing) - a function that takes an ArrayList of Item objects as input,
and returns the average price of the items - a function that takes an ArrayList
of Item objects as input, and returns the name of the most expensive Item
c) Write unit tests for all ItemCalculator functions that return a value, to
demonstrate that the functions are working correctly. These tests can be written
in the ItemCalculator class, or in an external ItemCalculatorTest class. */

import java.util.*;

public class ItemCalculator
{
    public static String NameandPrice(ArrayList <Item> items)
    {
      String all = "";
      for (int i=0; i<items.size(); i++) {
        Item a = items.get(i);
        all += "Name: " + a.getName() + "  ";
        all += "Price: " + a.getPrice() + "  ";
      }
      return all;
    }

    public static float PriceAvg(ArrayList <Item> items){
      float total = 0;
      for (int i=0; i<items.size(); i++){
            Item a = items.get(i);
            total += a.getPrice();
          }
      return total / items.size();
    }

    public static String ExpensiveItem(ArrayList <Item> items){
      String most = "";
      float highest = 0.0f;
      for (int i=0; i<items.size(); i++) {
        Item a = items.get(i);
        if (a.getPrice() > highest){
          highest = a.getPrice();
          most = a.getName();
        }
      }
      return most;
    }

    public static void main(String[] args)
      {
          ArrayList<Item> items = new ArrayList<Item>();

          Item i1 = new Item("apple", 2);
          items.add(i1);

          Item i2 = new Item("milk", 5);
          items.add(i2);

          Item i3 = new Item("bread", 4);
          items.add(i3);


          System.out.println("Name and Price: " +
              NameandPrice(items));

           System.out.println("Average Price: " +
              PriceAvg(items));

            System.out.println("Most Expensive Item: " +
             ExpensiveItem(items));
        }
}
