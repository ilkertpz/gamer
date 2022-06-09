package com.gamerface.model.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class AddressDTO {

  private String addressLine1;
  private String city;
  private String state;
  private String zipcode;

}
