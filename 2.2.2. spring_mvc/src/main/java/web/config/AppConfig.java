package web.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import web.Servise.serviseCar;


@Configuration
@ComponentScan(basePackages = "web")
public class AppConfig {

    @Bean(name="serviceCar")
    public serviseCar getSrviceCar(){
        serviseCar serviseCar = new serviseCar();
        return serviseCar;
    }

}
