package ces.augusto108.finaid_payment_sys.services.exceptions;

public class NotFoundException extends RuntimeException {
    private static final long serialVersionUID = 3995505941137459031L;

    public NotFoundException(String message) {
        super(message);
    }
}
