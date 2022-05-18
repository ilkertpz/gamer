package com.gamerface.model.domain.repository;


import com.gamerface.model.adapter.GamerRepoMongoImpl;
import com.gamerface.model.domain.Gamer;
import com.gamerface.model.request.GamerDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GamerRepoImpl implements GamerRepo{

  private final GamerRepoMongoImpl repository;

  @Override
  public boolean signIn(Gamer gamer) {
    repository.save(gamer);
    return true;
  }
}
