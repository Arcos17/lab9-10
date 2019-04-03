package lab6;

import lab8.WrongCaloricContentValueException;
import lab8.WrongNumberValueException;

import java.util.Objects;

public class Vegetables {
    private int number;
    private int caloric_content;

    public Vegetables(int number, int caloric_content) {
        if (number <= 100) {
            throw new WrongNumberValueException("Проблема в том, что количество овощей <= 100, и невозможно " +
                    "найти такой ингредиент");
        }
        if (caloric_content <= 0) {
            throw new WrongCaloricContentValueException("Проблема в том, что калорийность ингредиентов <= 0, и это " +
                    "не возможно для этих ингредиентов");
        }
        this.number = number;
        this.caloric_content = caloric_content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vegetables that = (Vegetables) o;
        return number == that.number &&
                caloric_content == that.caloric_content;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, caloric_content);
    }

    public int getCaloric_content() {

        return caloric_content;
    }


    @Override
    public String toString() {
        return number + " штуки " + this.getClass().getSimpleName() + " " + caloric_content + " калорий";
    }
    public int getNumber() {
        return number;
    }

}
