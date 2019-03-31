package lab6;

import java.util.Arrays;
import java.util.Comparator;

public class Salad {
    private Vegetables[] vegetables;

    private int count;

    public Salad(int size) {
        vegetables = new Vegetables[size];

    }

    /*    *//*    public void add(lab6.Vegetables vegetable) {
            if (sum<vegetables.length){
                vegetables[sum++]=vegetable;

            }
        }*/
    public void sortedbycaloris() {
        Arrays.sort(vegetables, Comparator.comparing(Vegetables::getCaloric_content));

    }

    @Override
    public String toString() {

        String result = "------Салат------\n";
        for (int i = 0; i < count; i++) {
            result += i + 1 + ". " + vegetables[i].toString() + "\n";
        }
        return result + "------------";
    }

    public void FindProposition(int firstIndex, int lastIndex) {

        for (int i = 0; i < vegetables.length; i++) {
            if (vegetables[i].getCaloric_content() <= lastIndex && vegetables[i].getCaloric_content() >= firstIndex) {
                System.out.println(vegetables[i]);
            }
        }
        if (lastIndex < 130 || firstIndex > 300) {
            System.out.println("В данном диапазоне ничего не найдено!!!");
        }
    }

    public void add(Vegetables vegetable) {
        if (count < vegetables.length) {
            vegetables[count++] = vegetable;
        }
    }


    public void Caloric_content() {
        int sum = 0;
        for (int i = 0; i < vegetables.length; i++) {
            sum += vegetables[i].getCaloric_content();

        }
        System.out.println("Калорийность салата составляет " + sum + " калорий");
        System.out.println("-------------------");
    }
}
