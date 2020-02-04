package io.confluent.developer.ccloud.demo.kstream.data.domain.transaction;

import java.math.BigDecimal;

import io.confluent.developer.ccloud.demo.kstream.data.domain.transaction.Transaction.Type;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TransactionRequest {

  private final String account;
  private final BigDecimal amount;
  private final Type type;
  private final String currency;
  private final String country;

}
