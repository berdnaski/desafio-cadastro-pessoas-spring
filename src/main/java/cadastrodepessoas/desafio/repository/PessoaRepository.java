package cadastrodepessoas.desafio.repository;

import cadastrodepessoas.desafio.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
}
