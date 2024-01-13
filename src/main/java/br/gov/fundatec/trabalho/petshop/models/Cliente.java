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

@Table(name = "CLIENTE")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    private String nome;
    private String cpf;

    @OneToMany(mappedBy = "cliente")
    private List<Atendimento> atendimento;
    @OneToMany(mappedBy = "cliente")
    private List<Pet> pets;
    @OneToOne(mappedBy = "cliente")
    private Endereco endereco;

}
