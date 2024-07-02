package br.gov.sp.fatec.domain.request;

import lombok.Data;

@Data
public class CarroRequest {
    private String modelo;
    private String placa;
}