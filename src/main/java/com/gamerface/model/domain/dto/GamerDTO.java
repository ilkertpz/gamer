package com.gamerface.model.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class GamerDTO {

  private String id;
  private String firstName;
  private String lastName;
  private String email;
  private String gamerId;
}
