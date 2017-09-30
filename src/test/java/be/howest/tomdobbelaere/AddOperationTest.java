package be.howest.tomdobbelaere;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tomdo on 30/09/2017.
 */
public class AddOperationTest {
    private AddOperation addOperation;

    @Before
    public void setUp() throws Exception {
        addOperation = new AddOperation(5, 2);
    }

    @Test
    public void evaluate() throws Exception {
        assertEquals((Integer) 7, addOperation.evaluate());
    }

}