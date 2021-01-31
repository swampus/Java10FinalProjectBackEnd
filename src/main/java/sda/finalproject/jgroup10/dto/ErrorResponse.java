package sda.finalproject.jgroup10.dto;

public class ErrorResponse {

    public ErrorResponse() {
    }

    public ErrorResponse(String message, String code, String operation) {
        this.message = message;
        this.code = code;
        this.operation = operation;
        this.error = "ERROR";
    }

    private String message;
    private String code;
    private String operation;
    private String error;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}

