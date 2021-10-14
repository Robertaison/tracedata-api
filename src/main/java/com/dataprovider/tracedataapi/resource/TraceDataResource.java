package com.dataprovider.tracedataapi.resource;

import com.dataprovider.tracedataapi.model.dto.TraceDataDto;
import com.dataprovider.tracedataapi.service.TraceDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TraceDataResource {

  @Autowired
  private TraceDataService service;

  @GetMapping
  public void getScoreDataFromCustomer(@PathVariable String cpf) {
      TraceDataDto scoreDataDto = service.getScoreDataFromCustomer(cpf);
  }
}
