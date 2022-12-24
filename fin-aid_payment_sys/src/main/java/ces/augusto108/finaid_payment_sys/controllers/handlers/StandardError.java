package ces.augusto108.finaid_payment_sys.controllers.handlers;

import java.io.Serializable;

public class StandardError implements Serializable {
    private static final long serialVersionUID = 6817292537586915837L;

    private Integer httpResponseStatus;
    private String message;
    private Long timestamp;
    private String httpMethod;

    public StandardError() {
    }

    public StandardError(Integer httpResponseStatus, String message, Long timestamp, String httpMethod) {
        this.httpResponseStatus = httpResponseStatus;
        this.message = message;
        this.timestamp = timestamp;
        this.httpMethod = httpMethod;
    }

    public Integer getHttpResponseStatus() {
        return httpResponseStatus;
    }

    public String getMessage() {
        return message;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public String getHttpMethod() {
        return httpMethod;
    }
}
