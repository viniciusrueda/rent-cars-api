package br.gov.sp.fatec.domain.mapper;

import br.gov.sp.fatec.domain.entity.Aluguel;
import br.gov.sp.fatec.domain.request.AluguelRequest;
import br.gov.sp.fatec.domain.response.AluguelResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AluguelMapper {
    Aluguel toEntity(AluguelRequest dto);
    AluguelResponse toResponse(Aluguel entity);
}