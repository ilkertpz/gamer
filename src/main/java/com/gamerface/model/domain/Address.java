package com.gamerface.model.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

/**
 * Value Object Pattern
 */
@Data
@SuperBuilder
public class Address {

  private String addressLine1;
  private String addressLine2;
  private String city;
  private String state;
  private String zipcode;

}
