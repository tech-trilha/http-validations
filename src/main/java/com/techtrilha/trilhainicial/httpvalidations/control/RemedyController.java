package com.techtrilha.trilhainicial.httpvalidations.control;

import com.techtrilha.trilhainicial.httpvalidations.remedy.Remedy;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RemedyController {

  @PostMapping("/remedies")
  public Remedy generateRemedy(@RequestBody Remedy remedy) {
    remedy.setId(1L);
    return remedy;
  }

}