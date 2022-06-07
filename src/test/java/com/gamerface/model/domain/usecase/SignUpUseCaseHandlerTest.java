package com.gamerface.model.domain.usecase;

import com.gamerface.model.domain.dto.GamerDTO;
import com.gamerface.model.domain.mapper.GamerMapperImpl;
import com.gamerface.model.fake.repo.GamerRepoImplFake;
import com.gamerface.model.request.SignUpUseCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SignUpUseCaseHandlerTest {

  SignUpUseCaseHandler signUpUseCaseHandler;

  @BeforeEach
  void init(){
    signUpUseCaseHandler = new SignUpUseCaseHandler(new GamerRepoImplFake(), new GamerMapperImpl());
  }

  @Test
  void should_sign_up() throws Exception {
    //given
    GamerDTO request = prepareSignUpRequest();
    SignUpUseCase signUpUseCase = new SignUpUseCase();
    signUpUseCase.setGamerDTO(request);

    //when
    Boolean result = signUpUseCaseHandler.handle(signUpUseCase);

    //then
    assertTrue(result);
  }

  @Test
  void should_not_sign_up() throws Exception {
    //given
    GamerDTO request = prepareSignUpRequest();
    request.setEmail(null);
    SignUpUseCase signUpUseCase = new SignUpUseCase();
    signUpUseCase.setGamerDTO(request);

    //when
    assertThatExceptionOfType(Exception.class)
        .isThrownBy(() -> signUpUseCaseHandler.handle(signUpUseCase))
        .withMessage("Email Not Valid");

  }

  //private methods
  GamerDTO prepareSignUpRequest(){
    return GamerDTO.builder()
        .firstName("TEST")
        .lastName("TEST")
        .gamerId("PuzzleLife")
        .email("domain@mail.com.tr").build();
  }
}
