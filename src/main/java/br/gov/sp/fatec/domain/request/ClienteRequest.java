package br.gov.sp.fatec.domain.request;

import lombok.Data;

@Data
public class ClienteRequest {
    private String nome;
    private String cpf;
}