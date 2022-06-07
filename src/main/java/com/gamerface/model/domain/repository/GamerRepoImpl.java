package com.gamerface.model.domain.repository;


import com.gamerface.model.adapter.GamerRepoMongoImpl;
import com.gamerface.model.domain.Gamer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GamerRepoImpl implements GamerRepo{

  private final GamerRepoMongoImpl repository;

  @Override
  public boolean signUp(Gamer gamer) {
    repository.save(gamer);
    return true;
  }

  @Override
  public boolean updateProfile(Gamer gamer) {
    repository.save(gamer);
    return true;
  }
}
