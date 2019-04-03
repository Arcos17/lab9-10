package lab8;

public class WrongCaloricContentValueException extends RuntimeException {
    public WrongCaloricContentValueException(){

    }
    public WrongCaloricContentValueException(String message){
        super(message);
    }
}
