package cadastrodepessoas.desafio.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "endereco")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "estado", length = 2)
    @NotEmpty
    private String estado;

    @Column(name = "cidade", length = 100)
    @NotEmpty
    private String cidade;

    @Column(name = "logradouro", length = 100)
    @NotEmpty
    private String logradouro;

    @Column(name = "numero")
    @NotEmpty
    private int numero;

    @Column(name = "cep", length = 8)
    @NotEmpty
    private String cep;

    @ManyToOne
    @JoinColumn(name = "pessoa_id", referencedColumnName = "id")
    private Pessoa pessoa;
}
