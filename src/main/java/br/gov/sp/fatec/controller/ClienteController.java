package br.gov.sp.fatec.controller;

import br.gov.sp.fatec.domain.request.ClienteRequest;
import br.gov.sp.fatec.domain.response.ClienteResponse;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public interface ClienteController {
    @PostMapping
    ClienteResponse save(@RequestBody ClienteRequest clienteRequest);

    @GetMapping("/{id}")
    ClienteResponse findById(@PathVariable Long id);

    @GetMapping
    List<ClienteResponse> findAll();

    @PutMapping("/{id}")
    ClienteResponse updateById(@PathVariable Long id, @RequestBody ClienteRequest clienteRequest);

    @DeleteMapping("/{id}")
    void deleteById(@PathVariable Long id);
}
