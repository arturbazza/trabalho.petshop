package br.gov.fundatec.trabalho.petshop.repository;

import br.gov.fundatec.trabalho.petshop.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
