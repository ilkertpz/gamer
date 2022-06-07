package com.gamerface.model.common;

import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.MappedSuperclass;


@MappedSuperclass
@NoArgsConstructor
@SuperBuilder
public abstract class AbstractBaseEntity {
  public void invokeRuleSet() throws Exception {
  }

}