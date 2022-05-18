package com.gamerface.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class GamerDTO {

  private String firstName;
  private String lastName;
  private String email;
  private String gamerId;
}
