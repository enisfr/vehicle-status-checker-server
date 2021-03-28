package com.enisfr.mbcarsimulator.exception;

import com.enisfr.mbcarsimulator.model.Response;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler({RuntimeException.class})
  @ResponseBody
  public ResponseEntity<Object> handleAllExceptions(RuntimeException ex, WebRequest request) {
    Response response = new Response();
    response.setMessage(ex.getMessage());
    return handleExceptionInternal(ex, response, new HttpHeaders(), HttpStatus.CONFLICT, request);
  }
}
