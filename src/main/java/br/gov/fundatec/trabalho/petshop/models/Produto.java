package br.gov.fundatec.trabalho.petshop.models;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "PRODUTO")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduto;
    private Double valor;
    private String descricao;

    @OneToMany(mappedBy = "produto")
    private List<Atendimento> atendimento;
    @ManyToOne
    private TipoAnimal tipoAnimal;
}
