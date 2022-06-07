package com.gamerface.model.domain.usecase;

import com.gamerface.model.domain.dto.GamerDTO;
import com.gamerface.model.domain.mapper.GamerMapperImpl;
import com.gamerface.model.fake.repo.GamerRepoImplFake;
import com.gamerface.model.request.UpdateProfileUseCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UpdateProfileUseCaseHandlerTest {

    UpdateProfileUseCaseHandler updateProfileUseCaseHandler;

    @BeforeEach
    void init() {
        updateProfileUseCaseHandler = new UpdateProfileUseCaseHandler(new GamerRepoImplFake(), new GamerMapperImpl());
    }

    @Test
    void should_update_profile() throws Exception {
        //given
        GamerDTO request = prepareSignUpRequest();
        UpdateProfileUseCase updateProfileUseCase = new UpdateProfileUseCase();
        updateProfileUseCase.setGamerDTO(request);

        //when
        Boolean result = updateProfileUseCaseHandler.handle(updateProfileUseCase);

        //then
        assertTrue(result);
    }

    @Test
    void should_not_not_update_profile() throws Exception {
        //given
        GamerDTO request = prepareSignUpRequest();
        request.setEmail(null);
        UpdateProfileUseCase updateProfileUseCase = new UpdateProfileUseCase();
        updateProfileUseCase.setGamerDTO(request);


        //when
        assertThatExceptionOfType(Exception.class)
                .isThrownBy(() -> updateProfileUseCaseHandler.handle(updateProfileUseCase))
                .withMessage("Email Not Valid");

    }

    //private methods
    GamerDTO prepareSignUpRequest() {
        return GamerDTO.builder()
                .id("1")
                .firstName("TEST")
                .lastName("TEST")
                .gamerId("PuzzleLife")
                .email("domain@mail.com.tr").build();
    }
}
