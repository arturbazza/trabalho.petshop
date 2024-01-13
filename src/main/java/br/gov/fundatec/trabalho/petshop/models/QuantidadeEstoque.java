package br.gov.fundatec.trabalho.petshop.models;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "QUANTIDADE_ESTOQUE")
public class QuantidadeEstoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idQuantidadeEstoque;
    private BigInteger quantidadeAtual;
}
