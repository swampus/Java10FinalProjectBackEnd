package sda.finalproject.jgroup10.handler;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import sda.finalproject.jgroup10.dto.ErrorResponse;
import sda.finalproject.jgroup10.exception.FinalProjectServiceException;

import java.util.List;
import java.util.stream.Collectors;


@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    public ErrorResponse handleAnyException(MethodArgumentNotValidException ex, WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setCode("Wrong input value!");
        List<String> errorDsc = ex.getBindingResult().getAllErrors()
                .stream()
                .map(t-> t.getObjectName() + " " + t.getDefaultMessage())
                .collect(Collectors.toList());
        errorResponse.setMessage(StringUtils.join(errorDsc, ", "));
        errorResponse.setOperation(request.getContextPath());
        return errorResponse;
    }


    @ExceptionHandler(value = {FinalProjectServiceException.class})
    public ErrorResponse handleAnyException(FinalProjectServiceException ex) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setOperation("Operation failed");
        errorResponse.setMessage(ex.getMessage());
        errorResponse.setCode(ex.getCode());
        return errorResponse;
    }

}


