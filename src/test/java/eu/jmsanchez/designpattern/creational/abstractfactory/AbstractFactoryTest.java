/*
 * Copyright (C) 2016 jose
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package eu.jmsanchez.designpattern.creational.abstractfactory;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jose
 */
public class AbstractFactoryTest {
    
    public AbstractFactoryTest() {
    }
    
    @Test
    public void checkAbstractFactory() {

        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        assertTrue(shapeFactory instanceof ShapeFactory);

        //get an object of Shape Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        assertTrue(shape1 instanceof Shape && shape1 instanceof Circle);    

        //get an object of Shape Rectangle
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        assertTrue(shape2 instanceof Shape && shape2 instanceof Rectangle);

        //get an object of Shape Square 
        Shape shape3 = shapeFactory.getShape("SQUARE");
        assertTrue(shape3 instanceof Shape && shape3 instanceof Square);

        //----------------------------------------------------------------------
        //get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        assertTrue(colorFactory instanceof ColorFactory);
        
        //get an object of Color Red
        Color color1 = colorFactory.getColor("RED");
        assertTrue(color1 instanceof Color && color1 instanceof Red);

        //get an object of Color Green
        Color color2 = colorFactory.getColor("Green");
        assertTrue(color2 instanceof Color && color2 instanceof Green);

        //get an object of Color Blue
        Color color3 = colorFactory.getColor("BLUE");
        assertTrue(color3 instanceof Color && color3 instanceof Blue);
   }
}
