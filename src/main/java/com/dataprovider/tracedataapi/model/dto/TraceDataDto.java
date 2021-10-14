package com.dataprovider.tracedataapi.model.dto;

import com.dataprovider.tracedataapi.model.BureauOfCreditQuery;
import com.dataprovider.tracedataapi.model.FinancialMovement;
import com.dataprovider.tracedataapi.model.LastCreditCardPaymentData;
import com.dataprovider.tracedataapi.model.TraceDataEntity;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TraceDataDto {

  private String cpf;
  private BureauOfCreditQuery lastQueryAtBureauOfCredit;
  private List<FinancialMovement> financialMovementList;
  private LastCreditCardPaymentData lastCreditCardPaymentData;
  private String updatedAt;

  public static TraceDataDto newInstance(TraceDataEntity entity) {
    return TraceDataDto.builder()
        .cpf(entity.getCpf())
        .lastQueryAtBureauOfCredit(entity.getLastQueryAtBureauOfCredit())
        .financialMovementList(entity.getFinancialMovementList())
        .lastCreditCardPaymentData(entity.getLastCreditCardPaymentData())
        .build();
  }
}
