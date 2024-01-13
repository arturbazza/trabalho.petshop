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

@Table(name = "VACINA")
public class Vacina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVacina;
    private String nome;
    private LocalDate validade;
    private String doencasAplicaveis;

    @OneToOne
    @JoinColumn(name = "idMamifero")
    private Mamifero mamifero;

}
