package br.gov.fundatec.trabalho.petshop.models;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "PEIXE")
public class Peixe extends TipoAnimal {

    @Column(nullable = false)
    private String tipoAgua;
}
