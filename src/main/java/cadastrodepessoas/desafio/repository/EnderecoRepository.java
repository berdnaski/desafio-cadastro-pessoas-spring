package cadastrodepessoas.desafio.repository;

import cadastrodepessoas.desafio.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
