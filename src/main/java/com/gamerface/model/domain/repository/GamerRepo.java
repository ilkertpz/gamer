package com.gamerface.model.domain.repository;

import com.gamerface.model.domain.Gamer;

/**
 * Repository Pattern
 */
public interface GamerRepo {
   boolean signUp(Gamer gamer);
   boolean updateProfile(Gamer gamer);

}
