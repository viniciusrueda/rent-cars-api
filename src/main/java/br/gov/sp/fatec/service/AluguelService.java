package br.gov.sp.fatec.service;

import br.gov.sp.fatec.domain.request.AluguelRequest;
import br.gov.sp.fatec.domain.response.AluguelResponse;
import java.util.List;

public interface AluguelService {
    AluguelResponse save(AluguelRequest aluguelRequest);
    AluguelResponse findById(Long id);
    List<AluguelResponse> findAll();
    AluguelResponse updateById(Long id, AluguelRequest aluguelRequest);
    void deleteById(Long id);
}
