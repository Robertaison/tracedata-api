package com.dataprovider.tracedataapi.listener;

import com.dataprovider.tracedataapi.model.dto.TraceDataDto;
import com.dataprovider.tracedataapi.service.TraceDataService;
import com.dataprovider.tracedataapi.util.ObjectConverter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TraceDataListener {

  @Autowired
  private TraceDataService service;

  @Autowired
  private ObjectConverter converter;

  @RabbitListener(queues = "trace-data-queue")
  public void traceDataQueueListener(@Payload String payload){
    log.info("M=scoreDataQueueListener, payload={}", payload);
    TraceDataDto dto = converter.toObject(payload, TraceDataDto.class);

    log.info("M=scoreDataQueueListener, convertedObject={}", dto);
    service.saveUpdateDataFromCustomer(dto);
  }
}
