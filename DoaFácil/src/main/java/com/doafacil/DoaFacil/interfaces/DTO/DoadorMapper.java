package com.doafacil.DoaFacil.interfaces.DTO;

import com.doafacil.DoaFacil.infrastructure.persistence.Doador;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper (componentModel = "spring")
public interface DoadorMapper {
    DoadorDTO toDTO (Doador doador);

    Doador toEntity (DoadorDTO dto);
}
