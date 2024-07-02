package br.gov.sp.fatec.service.impl;

import br.gov.sp.fatec.domain.entity.Carro;
import br.gov.sp.fatec.domain.mapper.CarroMapper;
import br.gov.sp.fatec.domain.request.CarroRequest;
import br.gov.sp.fatec.domain.response.CarroResponse;
import br.gov.sp.fatec.repository.CarroRepository;
import br.gov.sp.fatec.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarroServiceImpl implements CarroService {
    @Autowired
    private CarroRepository carroRepository;

    @Autowired
    private CarroMapper carroMapper;

    @Override
    public CarroResponse save(CarroRequest carroRequest) {
        Carro carro = carroMapper.toEntity(carroRequest);
        return carroMapper.toResponse(carroRepository.save(carro));
    }

    @Override
    public CarroResponse findById(Long id) {
        return carroRepository.findById(id)
                .map(carroMapper::toResponse)
                .orElse(null);
    }

    @Override
    public List<CarroResponse> findAll() {
        return carroRepository.findAll().stream()
                .map(carroMapper::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    public CarroResponse updateById(Long id, CarroRequest carroRequest) {
        if (carroRepository.existsById(id)) {
            Carro carro = carroMapper.toEntity(carroRequest);
            carro.setId(id);
            return carroMapper.toResponse(carroRepository.save(carro));
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        carroRepository.deleteById(id);
    }
}
