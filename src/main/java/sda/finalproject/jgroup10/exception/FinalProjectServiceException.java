package sda.finalproject.jgroup10.exception;

public class FinalProjectServiceException extends RuntimeException {

    private String code;

    public FinalProjectServiceException() {
    }

    public FinalProjectServiceException(String message, String code) {
        super(message);
        this.code = code;
    }

    public FinalProjectServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
