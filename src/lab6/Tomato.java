package lab6;

import lab8.WrongCaloricContentValueException;
import lab8.WrongNumberValueException;

public class Tomato extends Vegetables {
    public Tomato(int number, int caloric_content)
            throws WrongCaloricContentValueException, WrongNumberValueException {

        super(number, caloric_content);
    }
}
