package br.gov.sp.fatec.controller.impl;

import br.gov.sp.fatec.controller.AluguelController;
import br.gov.sp.fatec.domain.request.AluguelRequest;
import br.gov.sp.fatec.domain.response.AluguelResponse;
import br.gov.sp.fatec.service.AluguelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class AluguelControllerImpl implements AluguelController {
    @Autowired
    private AluguelService aluguelService;

    @Override
    public AluguelResponse save(AluguelRequest aluguelRequest) {
        return aluguelService.save(aluguelRequest);
    }

    @Override
    public AluguelResponse findById(Long id) {
        return aluguelService.findById(id);
    }

    @Override
    public List<AluguelResponse> findAll() {
        return aluguelService.findAll();
    }

    @Override
    public AluguelResponse updateById(Long id, AluguelRequest aluguelRequest) {
        return aluguelService.updateById(id, aluguelRequest);
    }

    @Override
    public void deleteById(Long id) {
        aluguelService.deleteById(id);
    }
}
