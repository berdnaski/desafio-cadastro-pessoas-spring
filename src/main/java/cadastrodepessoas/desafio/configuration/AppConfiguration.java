package cadastrodepessoas.desafio.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

@Configuration
public class AppConfiguration {

    @Bean
    public RedirectAttributes redirectAttributes() {
        return new RedirectAttributesModelMap();
    }
}
