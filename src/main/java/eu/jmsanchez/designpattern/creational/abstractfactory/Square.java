package eu.jmsanchez.designpattern.creational.abstractfactory;

/**
 *
 * @author jose
 */
public class Square implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}