package cadastrodepessoas.desafio.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pessoa")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nome", length = 150)
    @NotEmpty
    private String nome;
    @Column(name = "idade")
    @NotEmpty
    private Integer idade;
    @Column(name = "sexo", length = 2)
    private String sexo;
}
