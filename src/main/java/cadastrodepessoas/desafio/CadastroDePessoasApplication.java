package cadastrodepessoas.desafio;

import com.sun.faces.config.ConfigureListener;
import jakarta.servlet.ServletRegistration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import javax.faces.webapp.FacesServlet;

@SpringBootApplication
public class CadastroDePessoasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroDePessoasApplication.class, args);
	}

	@Bean
	public ServletContextInitializer facesServletInitializer() {
		return servletContext -> {
			FacesServlet facesServlet = new FacesServlet();
			ServletRegistration.Dynamic registration = servletContext.addServlet("Faces Servlet", String.valueOf(facesServlet));
			registration.addMapping("*.xhtml");
		};
	}


	@Bean
	public ServletContextInitializer servletContextInitializer() {
		return servletContext -> {
			servletContext.setInitParameter("javax.faces.FACELETS_SKIP_COMMENTS", "true");
			servletContext.setInitParameter("com.sun.faces.forceLoadConfiguration", Boolean.TRUE.toString());
			servletContext.setInitParameter("primefaces.THEME", "redmond");
		};
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
