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
package eu.jmsanchez.designpattern.behavioral.memento;

import eu.jmsanchez.designpattern.behavioral.memento.Originator;
import eu.jmsanchez.designpattern.behavioral.memento.CareTaker;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jose
 */
public class MementoTest {
    
    public MementoTest() {
    }

    @Test
    public void checkMemento(){
      Originator originator = new Originator();
      CareTaker careTaker = new CareTaker();
      
      originator.setState("State #1");
      originator.setState("State #2");
      careTaker.add(originator.saveStateToMemento());
      
      originator.setState("State #3");
      careTaker.add(originator.saveStateToMemento());
      
      originator.setState("State #4");
      assertTrue(originator.getState().equals("State #4"));
      
      originator.getStateFromMemento(careTaker.get(0));
      assertTrue(originator.getState().equals("State #2"));
      originator.getStateFromMemento(careTaker.get(1));
      assertTrue(originator.getState().equals("State #3"));
   }
}
