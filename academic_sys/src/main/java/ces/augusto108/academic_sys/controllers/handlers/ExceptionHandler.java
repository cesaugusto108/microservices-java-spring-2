package ces.augusto108.academic_sys.controllers.handlers;

import ces.augusto108.academic_sys.services.exceptions.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler
    public ResponseEntity<StandardError> handleNotFoundException(NotFoundException e, HttpServletRequest request) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                new StandardError(
                        HttpStatus.NOT_FOUND.value(),
                        e.getMessage(),
                        System.currentTimeMillis(),
                        request.getMethod())
        );
    }
}
