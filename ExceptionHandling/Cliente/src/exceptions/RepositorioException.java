package exceptions;

/**
 * Created by Bruno on 08/05/2016.
 */
public class RepositorioException extends RuntimeException {
    public RepositorioException(){}
    public RepositorioException(String message){ super(message); }
}
