package br.gov.fundatec.trabalho.petshop.repository;

import br.gov.fundatec.trabalho.petshop.models.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Long> {
}
