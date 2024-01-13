package br.gov.fundatec.trabalho.petshop.repository;

import br.gov.fundatec.trabalho.petshop.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
