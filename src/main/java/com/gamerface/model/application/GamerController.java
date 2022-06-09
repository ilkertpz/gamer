package com.gamerface.model.application;

import com.gamerface.model.common.UseCaseHandler;
import com.gamerface.model.request.SignUpUseCase;
import com.gamerface.model.request.UpdateProfileUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/gamer")
@RequiredArgsConstructor
public class GamerController {

  private final UseCaseHandler<Boolean, SignUpUseCase> signUpRequestUseCaseHandler;
  private final UseCaseHandler<Boolean, UpdateProfileUseCase> updateProfileRequestUseCaseHandler;

  @PostMapping(value = "/sign-up", produces = MediaType.APPLICATION_JSON_VALUE)
  Boolean signUp(@RequestBody SignUpUseCase useCase) throws Exception {
    return signUpRequestUseCaseHandler.handle(useCase);
  }

  @PostMapping(value = "/update", produces = MediaType.APPLICATION_JSON_VALUE)
  Boolean update(@RequestBody UpdateProfileUseCase useCase) throws Exception {
    return updateProfileRequestUseCaseHandler.handle(useCase);
  }

}
