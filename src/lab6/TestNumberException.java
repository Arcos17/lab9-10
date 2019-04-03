package lab6;

import lab8.WrongCaloricContentValueException;
import lab8.WrongNumberValueException;
import org.junit.Test;

public class TestNumberException {
    @Test(expected = WrongNumberValueException.class)
    public void TestNumberException() throws WrongNumberValueException{
        Vegetables vegetables = new Tomato(2,75);
    }

}
