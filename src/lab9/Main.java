package lab9;

import lab6.Tomato;
import lab6.Sauce;
import lab6.Cucumber;
import lab6.Vegetables;
import lab7.MySet;


public class Main {
    public static void main(String[] args)  {
        MySet mySet = new MySet();
        Tomato vegetables1 = new Tomato(5, 400);
        mySet.add(vegetables1);
        Cucumber vegetables2 = new Cucumber(4, 120);
        mySet.add(vegetables2);

        FileWorker.saveCollectionToFile("1.obj", mySet);

        FileWorker.saveObjectsToTextFile("2.obj", vegetables1, vegetables2);

        FileWorker.saveObjectsToTextFile("3.txt", vegetables1, vegetables2);
        System.out.println("File was recorded");

    }
}
