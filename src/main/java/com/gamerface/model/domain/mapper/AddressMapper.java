package com.gamerface.model.domain.mapper;


import com.gamerface.model.domain.Address;
import com.gamerface.model.domain.dto.AddressDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper {

  AddressDTO toDTO(Address address);

  Address toEntity(AddressDTO addressDTO) throws Exception;

}
