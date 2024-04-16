package cadastrodepessoas.desafio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {

    @GetMapping("/listagem")
    public String mostrarListagemPage() {
        return "listagem.xhtml";
    }

    @GetMapping("/cadastro")
    public String showCadastroPage() {
        return "cadastroPessoa.xhtml";
    }
}
