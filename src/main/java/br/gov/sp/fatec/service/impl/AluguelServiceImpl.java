package br.gov.sp.fatec.service.impl;

import br.gov.sp.fatec.domain.entity.Aluguel;
import br.gov.sp.fatec.domain.mapper.AluguelMapper;
import br.gov.sp.fatec.domain.request.AluguelRequest;
import br.gov.sp.fatec.domain.response.AluguelResponse;
import br.gov.sp.fatec.repository.AluguelRepository;
import br.gov.sp.fatec.service.AluguelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AluguelServiceImpl implements AluguelService {
    @Autowired
    private AluguelRepository aluguelRepository;

    @Autowired
    private AluguelMapper aluguelMapper;

    @Override
    public AluguelResponse save(AluguelRequest aluguelRequest) {
        Aluguel aluguel = aluguelMapper.toEntity(aluguelRequest);
        return aluguelMapper.toResponse(aluguelRepository.save(aluguel));
    }

    @Override
    public AluguelResponse findById(Long id) {
        return aluguelRepository.findById(id)
                .map(aluguelMapper::toResponse)
                .orElse(null);
    }

    @Override
    public List<AluguelResponse> findAll() {
        return aluguelRepository.findAll().stream()
                .map(aluguelMapper::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    public AluguelResponse updateById(Long id, AluguelRequest aluguelRequest) {
        if (aluguelRepository.existsById(id)) {
            Aluguel aluguel = aluguelMapper.toEntity(aluguelRequest);
            aluguel.setId(id);
            return aluguelMapper.toResponse(aluguelRepository.save(aluguel));
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        aluguelRepository.deleteById(id);
    }
}
