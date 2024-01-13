package br.gov.fundatec.trabalho.petshop.repository;

import br.gov.fundatec.trabalho.petshop.models.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
