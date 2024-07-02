package br.gov.sp.fatec.controller;

import br.gov.sp.fatec.domain.request.CarroRequest;
import br.gov.sp.fatec.domain.response.CarroResponse;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/carros")
public interface CarroController {
    @PostMapping
    CarroResponse save(@RequestBody CarroRequest carroRequest);

    @GetMapping("/{id}")
    CarroResponse findById(@PathVariable Long id);

    @GetMapping
    List<CarroResponse> findAll();

    @PutMapping("/{id}")
    CarroResponse updateById(@PathVariable Long id, @RequestBody CarroRequest carroRequest);

    @DeleteMapping("/{id}")
    void deleteById(@PathVariable Long id);
}
