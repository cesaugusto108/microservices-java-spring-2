package ces.augusto108.academic_sys.services.exceptions;

public class NotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1785354962411468398L;

    public NotFoundException(String message) {
        super(message);
    }
}
