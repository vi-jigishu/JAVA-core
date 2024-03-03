package CustomException;

public class AgeException extends Exception {     //AgeExpetion is the subclass of class Exception. When AgeException error occurs(or say AgeException class is called) then the constructor method AgeException() calls the super constructor method(which is with Exception parent class) and then the error/exception is dealt by the parent class(Exception class) 
    AgeException(String message){    
        super(message);
    }
}
