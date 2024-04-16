package cadastrodepessoas.desafio.beans;

import cadastrodepessoas.desafio.entity.Pessoa;
import cadastrodepessoas.desafio.service.PessoaService;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Named(value = "cadastroPessoaBean")
@ViewScoped
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CadastroPessoaBean implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Inject
    private PessoaService pessoaService;

    private Pessoa pessoa = new Pessoa();
    private List<Pessoa> pessoas;

    @PostConstruct
    public void init() {
        pessoas = pessoaService.getAllPessoa();
    }

    public void savePessoa() {
        pessoaService.savePessoa(pessoa);
        clearForm();
        pessoas = pessoaService.getAllPessoa();
    }

    public void deletePessoa(Pessoa pessoa) {
        pessoaService.deletePessoa(pessoa.getId());
        pessoas.remove(pessoa);
    }

    public void clearForm() {
        pessoa = new Pessoa();
    }
}
