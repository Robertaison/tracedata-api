package com.dataprovider.tracedataapi.model;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class FinancialMovement {

  private String amount;
  private String type;
  private LocalDateTime dateTime;
}
