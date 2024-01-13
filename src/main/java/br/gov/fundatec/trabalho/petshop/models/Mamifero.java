package br.gov.fundatec.trabalho.petshop.models;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "MAMIFERO")
public class Mamifero extends TipoAnimal {
    private String raca;
    private boolean possuiPelos;

    @OneToOne(mappedBy = "mamifero")
    private Vacina vacina;
}
