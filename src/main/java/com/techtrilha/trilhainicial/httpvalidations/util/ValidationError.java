package com.techtrilha.trilhainicial.httpvalidations.util;

public class ValidationError {

  private final String field;
  private final String description;

  public ValidationError(String field, String description) {
    this.field = field;
    this.description = description;
  }

  public String getField() {
    return field;
  }

  public String getDescription() {
    return description;
  }

}
