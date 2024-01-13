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

@Table(name = "UNIDADE")
public class Unidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUnidade;
    private String nome;

    @OneToOne
    @JoinColumn(name = "idEndereco")
    private Endereco endereco;

    @OneToMany(mappedBy = "unidade")
    private List<Atendimento> atendimento;

}
