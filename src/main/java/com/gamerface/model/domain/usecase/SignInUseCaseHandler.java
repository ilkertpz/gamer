package com.gamerface.model.domain.usecase;

import com.gamerface.model.common.UseCaseHandler;
import com.gamerface.model.domain.mapper.GamerMapper;
import com.gamerface.model.request.GamerDTO;
import com.gamerface.model.domain.repository.GamerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SignInUseCaseHandler implements UseCaseHandler<Boolean, GamerDTO> {

  private final GamerRepo gamerRepo;
  private final GamerMapper gamerMapper;

  @Override
  public Boolean handle(GamerDTO gamerDTO) throws Exception {
    return gamerRepo.signIn(gamerMapper.toEntity(gamerDTO));
  }
}
