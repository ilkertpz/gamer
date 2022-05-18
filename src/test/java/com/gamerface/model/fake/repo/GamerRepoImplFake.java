package com.gamerface.model.fake.repo;

import com.gamerface.model.domain.Gamer;
import com.gamerface.model.domain.repository.GamerRepo;
import com.gamerface.model.request.GamerDTO;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "integration-test.fake.enabled", havingValue = "true")
public class GamerRepoImplFake implements GamerRepo {

  @Override
  public boolean signIn(Gamer gamer) {
    return true;
  }

}
