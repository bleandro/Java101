package exceptions;

/**
 * Created by Bruno on 08/05/2016.
 */
public class ElementoJaExistenteException extends RuntimeException {
    public ElementoJaExistenteException(){}
    public ElementoJaExistenteException(String message){ super(message); }
}
