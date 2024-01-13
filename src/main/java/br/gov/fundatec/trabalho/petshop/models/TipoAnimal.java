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
@Table(name = "TIPO_ANIMAL")

@Inheritance(strategy = InheritanceType.JOINED)
public class TipoAnimal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTipoAnimal;
    private String especie;

    @OneToMany(mappedBy = "tipoAnimal")
    private List<Pet> pets;

    @ManyToOne
    @JoinColumn(name = "idProduto")
    private Produto produto;

}
