package ces.augusto108.administrative_sys.services.exceptions;

public class NotFoundException extends RuntimeException{
    private static final long serialVersionUID = -5221373450687406054L;

    public NotFoundException(String message) {
        super(message);
    }
}
