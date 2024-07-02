package br.gov.sp.fatec.domain.response;

import lombok.Data;

@Data
public class CarroResponse {
    private Long id;
    private String modelo;
    private String placa;
}