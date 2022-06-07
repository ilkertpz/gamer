package com.gamerface.model.request;

import com.gamerface.model.domain.dto.GamerDTO;
import lombok.Data;

@Data
public class UpdateProfileUseCase {

    private GamerDTO gamerDTO;
}
