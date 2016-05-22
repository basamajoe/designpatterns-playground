
package eu.jmsanchez.designpattern.creational.singleton;

import eu.jmsanchez.designpattern.creational.signleton.SingleObject;
import javax.annotation.PostConstruct;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jose
 */
public class SingletonTest {

    public SingletonTest() {
    }

    @Test
    public void checkSingleton() {

        //ILLEGAL construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();
        
        //Get the only object available
        SingleObject object = SingleObject.getInstance();

        assertEquals(object, SingleObject.getInstance());
        assertTrue(object == SingleObject.getInstance());
    }
}
