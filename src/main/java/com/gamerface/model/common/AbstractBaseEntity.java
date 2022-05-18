package com.gamerface.model.common;

import javax.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@MappedSuperclass
@NoArgsConstructor
@SuperBuilder
public abstract class AbstractBaseEntity {
  public void invokeRuleSet() throws Exception {
  }

}