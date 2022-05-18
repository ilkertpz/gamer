package com.gamerface.model.common;

import org.mapstruct.AfterMapping;
import org.mapstruct.MappingTarget;

public interface RuleMapper {

    @AfterMapping
    default void invokeEntityRules(@MappingTarget AbstractBaseEntity entity)  throws Exception {
      entity.invokeRuleSet();
    }

}
