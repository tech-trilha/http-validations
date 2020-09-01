package com.techtrilha.trilhainicial.httpvalidations.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.util.ArrayList;
import java.util.UUID;

@ControllerAdvice
public class RestApiExceptionHandler {

  @ExceptionHandler(value = {MethodArgumentNotValidException.class})
  public ResponseEntity<ErrorResponse> handleValidationError(
      final MethodArgumentNotValidException ex) {
    final var errors = new ArrayList<ValidationError>();
    ex.getBindingResult().getFieldErrors().forEach((error) -> {
      final var fieldName = error.getField();
      final var errorMessage = error.getDefaultMessage();
      errors.add(new ValidationError(fieldName, errorMessage));
    });
    final var correlationId = UUID.randomUUID().toString();
    return ResponseEntity.status(HttpStatus.BAD_REQUEST)
        .body(new ErrorResponse(correlationId, "INPUT_ERROR", "Invalid request", errors));
  }

}
