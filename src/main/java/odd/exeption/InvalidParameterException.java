package odd.exeption;

/**
 *
 * InvalidParameterException is thrown when input parameters are invalid
 */
public class InvalidParameterException extends Exception {
    @Override
    public String getMessage() {
        return "InvalidParameterException";
    }
}
