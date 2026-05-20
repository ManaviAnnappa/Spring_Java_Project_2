package pl.edu.vistula.firstrestapispring;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
        info = @Info(
                title = "First REST API Spring Project",
                version = "1.0",
                description = "API documentation for Vistula Spring Framework project"
        )
)
@SpringBootApplication
public class FirstRestApiSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstRestApiSpringApplication.class, args);
    }
}
