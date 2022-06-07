package com.gamerface.model.domain.usecase;

import com.gamerface.model.common.UseCaseHandler;
import com.gamerface.model.domain.mapper.GamerMapper;
import com.gamerface.model.domain.repository.GamerRepo;
import com.gamerface.model.request.SignUpUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SignUpUseCaseHandler implements UseCaseHandler<Boolean, SignUpUseCase> {

  private final GamerRepo gamerRepo;
  private final GamerMapper gamerMapper;

  @Override
  public Boolean handle(SignUpUseCase useCase) throws Exception {
    return gamerRepo.signUp(gamerMapper.toEntity(useCase.getGamerDTO()));
  }
}
