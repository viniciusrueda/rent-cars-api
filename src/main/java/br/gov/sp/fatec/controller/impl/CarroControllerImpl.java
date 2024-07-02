package br.gov.sp.fatec.controller.impl;

import br.gov.sp.fatec.controller.CarroController;
import br.gov.sp.fatec.domain.request.CarroRequest;
import br.gov.sp.fatec.domain.response.CarroResponse;
import br.gov.sp.fatec.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class CarroControllerImpl implements CarroController {
    @Autowired
    private CarroService carroService;

    @Override
    public CarroResponse save(CarroRequest carroRequest) {
        return carroService.save(carroRequest);
    }

    @Override
    public CarroResponse findById(Long id) {
        return carroService.findById(id);
    }

    @Override
    public List<CarroResponse> findAll() {
        return carroService.findAll();
    }

    @Override
    public CarroResponse updateById(Long id, CarroRequest carroRequest) {
        return carroService.updateById(id, carroRequest);
    }

    @Override
    public void deleteById(Long id) {
        carroService.deleteById(id);
    }
}
