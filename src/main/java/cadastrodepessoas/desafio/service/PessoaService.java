package cadastrodepessoas.desafio.service;

import cadastrodepessoas.desafio.entity.Pessoa;
import cadastrodepessoas.desafio.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {
    private PessoaRepository pessoaRepository;
    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public List<Pessoa> getAllPessoa() {
        return pessoaRepository.findAll();
    }

    public Optional<Pessoa> getByIdPessoa(int id) {
        return pessoaRepository.findById(id);
    }

    public Pessoa savePessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public void deletePessoa(int id) {
        pessoaRepository.deleteById(id);
    }
}
