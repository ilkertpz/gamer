package com.gamerface.model.domain.repository;

import com.gamerface.model.domain.Gamer;
import com.gamerface.model.request.GamerDTO;

/**
 * Repository Pattern
 */
public interface GamerRepo {
   boolean signIn(Gamer gamer);

}
