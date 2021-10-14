package com.dataprovider.tracedataapi.service;

import com.dataprovider.tracedataapi.model.dto.TraceDataDto;

public interface TraceDataService {
  TraceDataDto getScoreDataFromCustomer(String cpf);
  void saveUpdateDataFromCustomer(TraceDataDto dto);
}
