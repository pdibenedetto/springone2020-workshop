package io.confluent.developer.ccloud.demo.kstream.domain;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Funds {

  private final String account;
  private final BigDecimal balance;
  
}
