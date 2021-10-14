package com.dataprovider.tracedataapi.model;

import com.dataprovider.tracedataapi.model.dto.TraceDataDto;
import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Document
public class TraceDataEntity {

  @Id
  private String id;

  private String cpf;
  private BureauOfCreditQuery lastQueryAtBureauOfCredit;
  private List<FinancialMovement> financialMovementList;
  private LastCreditCardPaymentData lastCreditCardPaymentData;
  private LocalDateTime updatedAt;

  public static TraceDataEntity newInstance(TraceDataDto dto) {
    return TraceDataEntity.builder()
        .cpf(dto.getCpf())
        .lastQueryAtBureauOfCredit(dto.getLastQueryAtBureauOfCredit())
        .financialMovementList(dto.getFinancialMovementList())
        .lastCreditCardPaymentData(dto.getLastCreditCardPaymentData())
        .updatedAt(LocalDateTime.parse(dto.getUpdatedAt()))
        .build();
  }
}
