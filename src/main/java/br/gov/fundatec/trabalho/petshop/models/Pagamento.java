package br.gov.fundatec.trabalho.petshop.models;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "PAGAMENTO")
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPagamento;
    private Integer valor;
    private LocalDate dataPagamento;
    private FormaPagamento formaPagamento;

    @ManyToOne
    private Atendimento atendimento;
}
