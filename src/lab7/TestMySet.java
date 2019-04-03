package lab7;

import lab6.Cucumber;
import lab6.Sauce;
import lab6.Tomato;
import lab6.Vegetables;
import lab8.WrongNumberValueException;
import lab8.WrongCaloricContentValueException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestMySet extends Assert {
    MySet mySet;
    @Before
    public void before(){
        mySet = new MySet();
    }
    @Test
    public void testMySet() {
        assertEquals(0, mySet.size());
    }

    @Test(expected = WrongNumberValueException.class)
    public void testWrongNumberValueException()throws WrongNumberValueException{
        mySet.add(new Cucumber(-15,350));
    }
    @Test(expected =WrongCaloricContentValueException.class)
    public void testWrongCaloricContentValueException() throws WrongCaloricContentValueException{
        mySet.add(new Tomato(200,-200));}
    @Test
    public void testAdd()
    {
        mySet.add(new Sauce(200, 10));
        assertEquals(1, mySet.size());
    }

    @Test
    public void testContains() {
        Vegetables vegetables;
        vegetables = new Tomato(300, 75);
        mySet.add(vegetables);
        vegetables = new Cucumber(500, 140);
        mySet.add(vegetables);
        assertTrue(mySet.contains(vegetables));
    }
}
