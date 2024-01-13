package br.gov.fundatec.trabalho.petshop.models;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "ATENDIMENTO")
public class Atendimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAtendimento;
    private LocalDate dataAbertura;
    private String nomeAtendente;
    private boolean pagamentoEfetuado;
    private Double valorConsulta;
    @Column(length = 10)
    private String estado;
    private String nomeVeterinario;
    private LocalDate dataEncerramento;

    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Produto produto;
    @ManyToOne
    private Pet pet;
    @ManyToOne
    private Unidade unidade;
    @ManyToOne
    private Pagamento pagamento;
}
