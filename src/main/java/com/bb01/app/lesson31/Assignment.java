package com.bb01.app.lesson31;

/**
 * What is the difference between parsing and casting?
 * 
 * Parsing: Returns the string representation of the float argument.
 * The representation is exactly the one returned by the Float.toString() method.
 * 
 * Casting: Returns a new float initialized to the value represented by the specified String.
 * 
 * Results of the following code:
 * round prints 9
  typeof price java.lang.Float
  typeof round java.lang.Integer
  priceAsString prints 9.9
  typeof priceAsString java.lang.String
  true
  number prints 9
  typeof number java.lang.Integer
 * 
 */
public class Assignment {
  public static void main() {
    /* Task 1: Cast as int */
    float price = 9.9F;
    int round = 0;
    // Add code here
    round = (int) price;
    // prints 9
    System.out.println("round prints " + round); 
    System.out.println("typeof price " + ((Object)price).getClass().getName());
    System.out.println("typeof round " + ((Object)round).getClass().getName());
    /* Task 2: cast as string */
    String priceAsString = null;
    // Add code here
    priceAsString = String.valueOf(price);
    // prints "9.9"
    System.out.println("priceAsString prints " + priceAsString);
    System.out.println("typeof priceAsString " + ((Object)priceAsString).getClass().getName());
    // prints true
    System.out.println(priceAsString instanceof String);
    /* Task 3: cast priceAsString as int */
    int number = 0;
    // Add code here;
    number = (int) Float.parseFloat(priceAsString);
    // prints 9
    System.out.println("number prints " + number);
    System.out.println("typeof number " + ((Object)number).getClass().getName());
  }
}
