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
package eu.jmsanchez.designpattern.creational.factory;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jose
 */
public class ShapeFactoryTest {
    
    public ShapeFactoryTest() {
    }
    
    @Test
    public void checkFactory() {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        assertTrue(shape1 instanceof Shape && shape1 instanceof Circle);

        //get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        assertTrue(shape2 instanceof Shape && shape2 instanceof Rectangle);

        //get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");
        assertTrue(shape3 instanceof Shape && shape3 instanceof Square);
    }
}
