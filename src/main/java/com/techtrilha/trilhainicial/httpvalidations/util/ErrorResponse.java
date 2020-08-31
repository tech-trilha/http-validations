package com.techtrilha.trilhainicial.httpvalidations.util;

import java.time.Instant;
import java.util.List;

public class ErrorResponse {

  private final String correlationId;
  private final String errorCode;
  private final Instant timestamp = Instant.now();
  private final String message;

  private final List<ValidationError> errors;

  public ErrorResponse(final String correlationId, final String errorCode, final String message,
                       final List<ValidationError> errors) {
    this.correlationId = correlationId;
    this.errorCode = errorCode;
    this.message = message;
    this.errors = errors;
  }

  public String getCorrelationId() {
    return correlationId;
  }

  public String getErrorCode() {
    return errorCode;
  }

  public Instant getTimestamp() {
    return timestamp;
  }

  public String getMessage() {
    return message;
  }

  public List<ValidationError> getErrors() {
    return errors;
  }


}
