package br.gov.sp.fatec.domain.mapper;

import br.gov.sp.fatec.domain.entity.Carro;
import br.gov.sp.fatec.domain.request.CarroRequest;
import br.gov.sp.fatec.domain.response.CarroResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarroMapper {
    Carro toEntity(CarroRequest dto);
    CarroResponse toResponse(Carro entity);
}
