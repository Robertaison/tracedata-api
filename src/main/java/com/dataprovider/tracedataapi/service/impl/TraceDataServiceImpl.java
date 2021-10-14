package com.dataprovider.tracedataapi.service.impl;

import com.dataprovider.tracedataapi.model.TraceDataEntity;
import com.dataprovider.tracedataapi.model.dto.TraceDataDto;
import com.dataprovider.tracedataapi.repository.TraceDataRepository;
import com.dataprovider.tracedataapi.service.TraceDataService;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TraceDataServiceImpl implements TraceDataService {

  @Autowired
  private TraceDataRepository repository;

  @Override
  public TraceDataDto getScoreDataFromCustomer(String cpf) {
    log.info("M=ScoreDataService.getScoreDataFromCustomer, cpf={}", cpf);
    Optional<TraceDataEntity> scoreDataEntity = repository.findByCpf(cpf);
    return scoreDataEntity.map(TraceDataDto::newInstance).orElse(null);
  }

  @Override
  public void saveUpdateDataFromCustomer(TraceDataDto dto) {
    log.info("M=ScoreDataService.saveUpdateDataFromCustomer, received dto={}", dto);
    Optional<TraceDataEntity> entityOptional = repository.findByCpf(dto.getCpf());
    entityOptional.ifPresentOrElse(
        entity -> updateAndSaveEntity(entity, dto),
        () -> repository.save(TraceDataEntity.newInstance(dto))
    );
  }

  private void updateAndSaveEntity(TraceDataEntity entity, TraceDataDto dto) {
//    Set<PropertyEntity> properties = new HashSet<>();
//    dto.getProperties().forEach(
//        propertyDto -> properties.add(PropertyEntity.newInstance(propertyDto, entity))
//    );
//
//    entity.setAddress(dto.getAddress());
//    entity.setCustomerAge(dto.getCustomerAge());
//    entity.setSourceOfIncome(dto.getSourceOfIncome());
//    entity.setProperties(properties);
//    repository.saveAndFlush(entity);
  }
}
