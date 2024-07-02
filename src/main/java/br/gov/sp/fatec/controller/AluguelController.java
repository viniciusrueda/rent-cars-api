package br.gov.sp.fatec.controller;

import br.gov.sp.fatec.domain.request.AluguelRequest;
import br.gov.sp.fatec.domain.response.AluguelResponse;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/alugueis")
public interface AluguelController {
    @PostMapping
    AluguelResponse save(@RequestBody AluguelRequest aluguelRequest);

    @GetMapping("/{id}")
    AluguelResponse findById(@PathVariable Long id);

    @GetMapping
    List<AluguelResponse> findAll();

    @PutMapping("/{id}")
    AluguelResponse updateById(@PathVariable Long id, @RequestBody AluguelRequest aluguelRequest);

    @DeleteMapping("/{id}")
    void deleteById(@PathVariable Long id);
}
