package com.gamerface.model.domain.mapper;


import com.gamerface.model.common.RuleMapper;
import com.gamerface.model.domain.Gamer;
import com.gamerface.model.domain.dto.GamerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = { AddressMapper.class })
public interface GamerMapper extends RuleMapper{

  @Mapping(source = "address", target = "addressDTO")
  GamerDTO toDTO(Gamer gamer);
  @Mapping(source = "addressDTO", target = "address")
  Gamer toEntity(GamerDTO gamerDTO) throws Exception;

}
