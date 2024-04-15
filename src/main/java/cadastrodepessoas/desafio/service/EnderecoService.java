package cadastrodepessoas.desafio.service;

import cadastrodepessoas.desafio.entity.Endereco;
import cadastrodepessoas.desafio.repository.EnderecoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {
    private EnderecoRepository enderecoRepository;
    public EnderecoService(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    public List<Endereco> getByAllEndereco() {
        return enderecoRepository.findAll();
    }

    public Optional<Endereco> getByIdEndereco(int id) {
        return enderecoRepository.findById(id);
    }

    public Endereco saveEndereco(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    public void deleteEndereco(int id) {
        enderecoRepository.deleteById(id);
    }
}
