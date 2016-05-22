package eu.jmsanchez.designpattern.creational.abstractfactory;

/**
 *
 * @author jose
 */
public class Circle implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}
