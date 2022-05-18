package com.gamerface.model.domain;

import java.util.regex.Pattern;
import lombok.Data;
import lombok.experimental.SuperBuilder;

/**
 * Value Object Pattern
 */
@Data
@SuperBuilder
public class EmailValidator {

  private final static String regexPattern = "^(.+)@(\\S+)$";

  public static boolean validate(String email) {
    return email != null && Pattern.compile(regexPattern)
        .matcher(email)
        .matches();
  }

}
