package com.gamerface.model.fake.repo;

import com.gamerface.model.domain.Gamer;
import com.gamerface.model.domain.repository.GamerRepo;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "integration-test.fake.enabled", havingValue = "true")
public class GamerRepoImplFake implements GamerRepo {

  @Override
  public boolean signUp(Gamer gamer) {
    return true;
  }

  @Override
  public boolean updateProfile(Gamer gamer) {
    return true;
  }

}
