package eu.jmsanchez.designpattern.creational.abstractfactory;

/**
 *
 * @author jose
 */
public class Rectangle implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}
