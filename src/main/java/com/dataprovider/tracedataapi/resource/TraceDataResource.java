package com.dataprovider.tracedataapi.resource;

import com.dataprovider.tracedataapi.model.dto.TraceDataDto;
import com.dataprovider.tracedataapi.service.TraceDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TraceDataResource {

  @Autowired
  private TraceDataService service;

  @GetMapping("/trace-data")
  public ResponseEntity<TraceDataDto> getScoreDataFromCustomer(@RequestParam String cpf) {
      TraceDataDto traceDataDto = service.getScoreDataFromCustomer(cpf);
      return ResponseEntity.ok(traceDataDto);
  }
}
