package br.gov.sp.fatec.domain.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelo;
    private String placa;

    @OneToMany(mappedBy = "carro")
    private List<Aluguel> alugueis;
}