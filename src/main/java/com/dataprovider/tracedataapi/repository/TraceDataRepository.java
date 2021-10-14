package com.dataprovider.tracedataapi.repository;

import com.dataprovider.tracedataapi.model.TraceDataEntity;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TraceDataRepository extends MongoRepository<TraceDataEntity, String> {
  Optional<TraceDataEntity> findByCpf(String cpf);
}
