package exceptions;

/**
 * Created by Bruno on 08/05/2016.
 */
public class DadoInvalidoException extends RuntimeException {
    public DadoInvalidoException(){}
    public DadoInvalidoException(String message){ super(message); }
}
