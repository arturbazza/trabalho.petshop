package br.gov.fundatec.trabalho.petshop.models;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ENDERECO")

public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEndereco;
    private String logradouro;
    private String bairro;
    private Integer numero;

    @OneToOne
    @JoinColumn(name = "idCliente")
    private Cliente cliente;

    @OneToOne(mappedBy = "endereco")
    private Unidade unidade;

}
