import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tomdo on 30/09/2017.
 */
public class DogTest {
    private Dog dog;

    @Before
    public void setUp() throws Exception {
        dog = new Dog();
    }

    @Test
    public void speak() throws Exception {
        assertEquals("woof", dog.speak());
    }

}