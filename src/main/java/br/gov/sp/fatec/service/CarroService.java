package br.gov.sp.fatec.service;

import br.gov.sp.fatec.domain.request.CarroRequest;
import br.gov.sp.fatec.domain.response.CarroResponse;
import java.util.List;

public interface CarroService {
    CarroResponse save(CarroRequest carroRequest);
    CarroResponse findById(Long id);
    List<CarroResponse> findAll();
    CarroResponse updateById(Long id, CarroRequest carroRequest);
    void deleteById(Long id);
}
