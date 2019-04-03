package lab8;

public class WrongNumberValueException extends RuntimeException {
    public WrongNumberValueException(){

    }
    public WrongNumberValueException(String message){
        super(message);
    }
}
