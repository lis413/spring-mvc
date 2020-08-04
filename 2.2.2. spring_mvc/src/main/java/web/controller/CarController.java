package web.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.Servise.serviseCar;
import web.config.AppConfig;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        serviseCar bean = applicationContext.getBean(serviseCar.class);
       // serviseCar serviseCar = new serviseCar();
        model.addAttribute("messages", bean.getListCar());
        return "cars";
    }

}
