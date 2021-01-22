package demo.com.example.demo.connexion;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Connexion implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/acceuil").setViewName("acceuil");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/fichefrais").setViewName("fichefrais");
    }

}