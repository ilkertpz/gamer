package com.gamerface.model.domain.usecase;

import com.gamerface.model.common.UseCaseHandler;
import com.gamerface.model.domain.mapper.GamerMapper;
import com.gamerface.model.domain.repository.GamerRepo;
import com.gamerface.model.request.UpdateProfileUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UpdateProfileUseCaseHandler implements UseCaseHandler<Boolean, UpdateProfileUseCase> {

  private final GamerRepo gamerRepo;
  private final GamerMapper gamerMapper;

  @Override
  public Boolean handle(UpdateProfileUseCase useCase) throws Exception {
    return gamerRepo.updateProfile(gamerMapper.toEntity(useCase.getGamerDTO()));
  }
}
