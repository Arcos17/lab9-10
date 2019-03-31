package lab6;

import java.util.Objects;

public class Vegetables {
    private int number;
    private int caloric_content;

    public Vegetables(int number, int caloric_content) {
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

}
