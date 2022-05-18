package com.gamerface.model.domain.mapper;


import com.gamerface.model.common.RuleMapper;
import com.gamerface.model.domain.Gamer;
import com.gamerface.model.request.GamerDTO;
import java.util.List;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface GamerMapper extends RuleMapper{

  GamerDTO toDTO(Gamer gamer);

  Gamer toEntity(GamerDTO gamerDTO) throws Exception;

  List<GamerDTO> toDTOList(List<Gamer> entityList);

  List<Gamer> toEntityList(List<GamerDTO> dtoList) throws Exception;

}
