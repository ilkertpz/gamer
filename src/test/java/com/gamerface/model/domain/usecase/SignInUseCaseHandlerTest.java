package com.gamerface.model.domain.usecase;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.gamerface.model.domain.mapper.GamerMapperImpl;
import com.gamerface.model.fake.repo.GamerRepoImplFake;
import com.gamerface.model.request.GamerDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SignInUseCaseHandlerTest {

  SignInUseCaseHandler signInUseCaseHandler;

  @BeforeEach
  void init(){
    signInUseCaseHandler = new SignInUseCaseHandler(new GamerRepoImplFake(), new GamerMapperImpl());
  }

  @Test
  void should_sign_in() throws Exception {
    //given
    GamerDTO request = prepareSignInRequest();

    //when
    Boolean result = signInUseCaseHandler.handle(request);

    //then
    assertTrue(result);
  }

  @Test
  void should_not_sign_in() throws Exception {
    //given
    GamerDTO request = prepareSignInRequest();
    request.setEmail(null);

    //when
    assertThatExceptionOfType(Exception.class)
        .isThrownBy(() -> signInUseCaseHandler.handle(request))
        .withMessage("Email Not Valid");

  }

  //private methods
  GamerDTO prepareSignInRequest(){
    return GamerDTO.builder()
        .firstName("TEST")
        .lastName("TEST")
        .gamerId("PuzzleLife")
        .email("domain@mail.com.tr").build();
  }
}
