package br.gov.sp.fatec.domain.response;

import lombok.Data;
import java.time.LocalDate;

@Data
public class AluguelResponse {
    private Long id;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private ClienteResponse cliente;
    private CarroResponse carro;
}
