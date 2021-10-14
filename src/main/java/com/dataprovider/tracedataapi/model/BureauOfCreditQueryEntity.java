package com.dataprovider.tracedataapi.model;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class BureauOfCreditQueryEntity {
  private String name;
  private LocalDateTime date;
}
