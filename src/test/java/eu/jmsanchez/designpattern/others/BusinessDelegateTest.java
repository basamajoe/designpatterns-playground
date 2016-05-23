package eu.jmsanchez.designpattern.others;

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

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jose
 */
public class BusinessDelegateTest {
    
    public BusinessDelegateTest() {
    }
    
    @Test
    public void checkBusinessDelegate() {

      BusinessDelegate businessDelegate = new BusinessDelegate();
      businessDelegate.setServiceType("EJB");

      Client client = new Client(businessDelegate);
      assertTrue(client.doTask().equals("Processing task by invoking EJB Service"));

      businessDelegate.setServiceType("JMS");
      assertTrue(client.doTask().equals("Processing task by invoking JMS Service"));
   }
}
