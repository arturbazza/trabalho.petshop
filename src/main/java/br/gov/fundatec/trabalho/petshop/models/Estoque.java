package br.gov.fundatec.trabalho.petshop.models;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "ESTOQUE")
public class Estoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstoque;
    private LocalDate dataOperacao;
    private TipoOperacao tipoOperacao;
    private Integer quantidade;
    private LocalDate validade;
    @Column(length = 20)
    private Integer lote;

}
