package br.gov.fundatec.trabalho.petshop.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "REPTIL")
public class Reptil extends TipoAnimal {

    @Column(nullable = false)
    private boolean peconhento;

}
