package com.gamerface.model.domain;

import com.gamerface.model.common.AbstractBaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.Id;

/**
 * Entity Pattern
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Gamer")
public class Gamer extends AbstractBaseEntity {

  @Id
  private String id;
  private String firstName;
  private String gamerId;
  private String lastName;
  private String email;
  private Address address;

  //TODO BusinessRuleException class should be created
  private void isEmailValid() throws Exception {
    if(!EmailValidator.validate(this.email)){
      throw new Exception("Email Not Valid");
    }
  }

  @Override
  public void invokeRuleSet() throws Exception {
    isEmailValid();
  }
}
