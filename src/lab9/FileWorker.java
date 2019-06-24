package lab9;

import lab6.Cucumber;
import lab6.Tomato;
import lab6.Sauce;
import lab7.MySet;
import lab6.Vegetables;
import java.io.*;
import java.util.ArrayList;

public class FileWorker {

    public static void saveCollectionToFile(String fileName, MySet mySet) {
        File file = new File(fileName);
        try {
            OutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(mySet);
            objectOutputStream.close();
            System.out.println("1");
        } catch (FileNotFoundException e) {
            System.out.println("Сожалению, LeafFile не найден");
        } catch (IOException e) {
            System.out.println("Сожалению. Проблемы с записью в файл.");
        }
    }

    public static MySet loadCollectionFromFile(String fileName) {
        File file = new File(fileName);
        try {
            InputStream inputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            return (MySet) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void saveObjectsToFile(String fileName, Vegetables... vegetabless) {
        File file = new File(fileName);
        try {
            OutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            for (Vegetables vegetables : vegetabless) {
                objectOutputStream.writeObject(vegetables);
            }
            objectOutputStream.close();
            System.out.println("2");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Vegetables[] loadObjectsFromFile(String fileName) {
        File file = new File(fileName);
        try {
            InputStream inputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            ArrayList<Vegetables> vegetabless = new ArrayList<>();
            try {
                while (true) {
                    vegetabless.add((Vegetables) objectInputStream.readObject());
                }
            } catch (EOFException e) {
                return vegetabless.toArray(new Vegetables[0]);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void saveStringToFile(String filename, String string) {
        try {
            FileWriter fileWriter = new FileWriter(filename);
            fileWriter.write(string);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveObjectsToTextFile(String filename, Vegetables... vegetabless) {
        try {
            FileWriter fileWriter = new FileWriter(filename);
            for (Vegetables vegetables : vegetabless) {
                fileWriter.write(vegetables.toString());
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Vegetables[] loadObjectAsText(String filename) {
        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            ArrayList<Vegetables> vegetablessArrayList = new ArrayList<>();
            String read = new String(bufferedReader.readLine());
            while (read != null) {
                String[] numberFromTextSplitted = read.split(": ");
                int numberFromText = Integer.parseInt(numberFromTextSplitted[1]);
                String[] caloric_contentFromTextSplitted = (bufferedReader.readLine()).split(": ");
                int caloric_contentFromText = Integer.parseInt(caloric_contentFromTextSplitted[1]);

                Vegetables vegetables = new Vegetables(numberFromText, caloric_contentFromText);
                vegetablessArrayList.add(vegetables);

                read = bufferedReader.readLine();
            }
            return vegetablessArrayList.toArray(new Vegetables[]{});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}