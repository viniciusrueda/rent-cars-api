package br.gov.sp.fatec.controller.impl;

import br.gov.sp.fatec.controller.ClienteController;
import br.gov.sp.fatec.domain.request.ClienteRequest;
import br.gov.sp.fatec.domain.response.ClienteResponse;
import br.gov.sp.fatec.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ClienteControllerImpl implements ClienteController {
    @Autowired
    private ClienteService clienteService;

    @Override
    public ClienteResponse save(ClienteRequest clienteRequest) {
        return clienteService.save(clienteRequest);
    }

    @Override
    public ClienteResponse findById(Long id) {
        return clienteService.findById(id);
    }

    @Override
    public List<ClienteResponse> findAll() {
        return clienteService.findAll();
    }

    @Override
    public ClienteResponse updateById(Long id, ClienteRequest clienteRequest) {
        return clienteService.updateById(id, clienteRequest);
    }

    @Override
    public void deleteById(Long id) {
        clienteService.deleteById(id);
    }
}
