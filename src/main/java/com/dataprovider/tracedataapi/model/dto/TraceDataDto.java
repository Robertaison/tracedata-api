package com.dataprovider.tracedataapi.model.dto;

import com.dataprovider.tracedataapi.model.BureauOfCreditQueryEntity;
import com.dataprovider.tracedataapi.model.FinancialMovementEntity;
import com.dataprovider.tracedataapi.model.LastCreditCardPaymentDataEntity;
import com.dataprovider.tracedataapi.model.TraceDataEntity;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TraceDataDto {

  private String cpf;
  private BureauOfCreditQueryEntity lastQueryAtBureauOfCredit;
  private List<FinancialMovementEntity> financialMovementList;
  private LastCreditCardPaymentDataEntity lastCreditCardPaymentData;
  private String updatedAt;

  public static TraceDataDto newInstance(TraceDataEntity entity) {
    return TraceDataDto.builder()
        .cpf(entity.getCpf())
        .build();
  }
}
