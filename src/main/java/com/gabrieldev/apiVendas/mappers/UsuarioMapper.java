package com.gabrieldev.apiVendas.mappers;


import com.gabrieldev.apiVendas.dto.request.UsuarioDtoRequest;
import com.gabrieldev.apiVendas.dto.response.UsuarioDtoResponse;
import com.gabrieldev.apiVendas.entities.Usuario;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    Usuario toEntity(UsuarioDtoRequest dto);

    UsuarioDtoResponse toDTO(Usuario usuario);
}
