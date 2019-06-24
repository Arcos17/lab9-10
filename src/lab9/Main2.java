package lab9;

import lab6.Vegetables;
import lab7.MySet;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {

        MySet mySet = FileWorker.loadCollectionFromFile("1.obj");
        System.out.println(mySet.size());

        System.out.println(Arrays.toString(FileWorker.loadObjectsFromFile("2.obj")));

        System.out.println(Arrays.toString(FileWorker.loadObjectAsText("3.txt")));
    }
}
