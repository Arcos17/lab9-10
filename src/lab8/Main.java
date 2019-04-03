package lab8;
import lab7.MySet;
import lab6.Tomato;

public class Main {
    public static void main(String[] args) throws WrongCaloricContentValueException {
        try{
            new MySet().add(new Tomato(3,100));
        }
        catch (WrongNumberValueException e){
            System.out.println(e.getMessage());
        }
        catch (WrongCaloricContentValueException e){
            System.out.println(e.getMessage());
        }
    }
}
