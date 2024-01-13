package br.gov.fundatec.trabalho.petshop.models;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.*;

import java.time.LocalDate;
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "ATENDIMENTO_PRODUTO")
public class AtendimentoProduto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAtendimento;
    private Integer quantidade;
    private LocalDate dataEntrada;
}
