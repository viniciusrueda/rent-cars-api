package br.gov.sp.fatec.repository;

import br.gov.sp.fatec.domain.entity.Carro;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CarroRepository extends JpaRepository<Carro, Long> {
}
