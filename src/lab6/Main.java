package lab6;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Salad salad = new Salad(3);
        salad.add(new Cucumber(3,150));
        salad.add(new Tomato(5,130));
        salad.add((new Sauce(10,300)));
        System.out.println(salad);
        salad.Caloric_content();
        salad.sortedbycaloris();
        salad.Caloric_content();
        System.out.println("\n"+"Сортируем салад по калорийности!!!");
        System.out.println(salad);
        System.out.println("Введите нижнюю границу калорийности:");
        int x = scanner.nextInt();
        System.out.println("Введите верхнюю границу калорийности:");
        int y =scanner.nextInt();
        salad.FindProposition(x,y);
    }
}
