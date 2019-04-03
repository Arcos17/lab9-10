package lab6;

import lab8.WrongCaloricContentValueException;
import lab8.WrongNumberValueException;

public class Sauce extends Vegetables {
    public Sauce(int number, int caloric_content)
            throws WrongCaloricContentValueException, WrongNumberValueException {

        super(number, caloric_content);
    }
}
