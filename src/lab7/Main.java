package lab7;

import lab6.Cucumber;
import lab6.Sauce;
import lab6.Tomato;
import lab6.Vegetables;
import lab8.WrongCaloricContentValueException;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws WrongCaloricContentValueException {
        MySet myVegetables = new MySet();
        myVegetables.add(new Cucumber(1, 5));
        myVegetables.add(new Tomato(5, 150));
        myVegetables.add(new Sauce(1, 50));
        myVegetables.add(new Cucumber(1, 5));
        myVegetables.add(new Tomato(5, 150));
        myVegetables.add(new Sauce(3, 150));
        myVegetables.add(new Cucumber(1, 5));
        myVegetables.add(new Tomato(5, 150));
        myVegetables.add(new Sauce(2, 100));
        myVegetables.add(new Cucumber(1, 5));
        myVegetables.add(new Tomato(5, 150));
        myVegetables.add(new Sauce(4, 200));
        myVegetables.add(new Cucumber(1, 5));
        myVegetables.add(new Tomato(5, 150));
        myVegetables.add(new Sauce(5, 250));

        Iterator<Vegetables> iterator = myVegetables.iterator();
        System.out.println(myVegetables.isEmpty());
        System.out.println(myVegetables.size());
        System.out.println(myVegetables.contains(new Cucumber(1, 5)));
        System.out.println(myVegetables.remove(new Tomato(5, 150)));


        int x = 0;
        for (Vegetables vegetables : myVegetables) {
            System.out.println(iterator.next());
            x++;
        }

        System.out.println(x);

    }
}
