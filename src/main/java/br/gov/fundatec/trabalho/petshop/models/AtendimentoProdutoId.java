package br.gov.fundatec.trabalho.petshop.models;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
@Embeddable
public class AtendimentoProdutoId implements Serializable {
    @Column(name = "idProduto")
    private Long idProduto;
    @Column(name = "idAtendimento")
    private Long idAtendimento;

}
