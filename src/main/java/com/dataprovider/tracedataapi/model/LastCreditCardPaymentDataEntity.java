package com.dataprovider.tracedataapi.model;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class LastCreditCardPaymentDataEntity {
  private String companyName;
  private String amount;
  private String card;
  private String issuerBank;
  private LocalDateTime dateTime;
}
