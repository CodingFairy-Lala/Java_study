package sh.java.exception;

/**
 * 
 * Checked Exception 예외처리 강제화 extends Exception
 * UnChecked Exception 예외처리 강제화하지는 않음 extends RuntimeException
 * 
 */

public class UserAgeException extends RuntimeException {

    public UserAgeException(String string) {
    }

    public UserAgeException() {
    }

}
