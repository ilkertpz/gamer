package com.gamerface.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Value Object Pattern
 * Persistence: Stored in DB as part of a Customer object
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Address {

  private String addressLine1;
  private String city;
  private String state;
  private String zipcode;

}
