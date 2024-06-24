package cg.codegym.handlerException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerException {
    @ExceptionHandler(Exception.class)

    public void handleException(Exception e){
        System.out.println(e.getMessage());
    }
}
