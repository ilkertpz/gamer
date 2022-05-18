package com.gamerface.model.application;

import com.gamerface.model.common.UseCaseHandler;
import com.gamerface.model.request.GamerDTO;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/gamer")
@RequiredArgsConstructor
public class GamerController {

  private final UseCaseHandler<Boolean, GamerDTO> signInRequestUseCaseHandler;

  @PostMapping(value = "/sign-in", produces = MediaType.APPLICATION_JSON_VALUE)
  Boolean signIn(GamerDTO gamerDTO) throws Exception {
    return signInRequestUseCaseHandler.handle(gamerDTO);
  }

}
