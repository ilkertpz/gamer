package com.gamerface.model.common;

import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;


@MappedSuperclass
@NoArgsConstructor
@SuperBuilder
public abstract class AbstractBaseEntity implements Serializable {
  public void invokeRuleSet() throws Exception {
  }

}