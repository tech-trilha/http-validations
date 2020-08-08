package com.techtrilha.trilhainicial.httpvalidations.remedy;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class Remedy {

  @Positive
  private Long id;
  @NotBlank
  @Size(min = 2, max = 100)
  private String name;
  @Size(max = 500)
  private String description;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
