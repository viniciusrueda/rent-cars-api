package br.gov.sp.fatec.domain.request;

import lombok.Data;
import java.time.LocalDate;

@Data
public class AluguelRequest {
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Long clienteId;
    private Long carroId;
}