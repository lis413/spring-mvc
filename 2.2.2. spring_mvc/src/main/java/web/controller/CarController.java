package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.Servise.serviseCar;
import web.config.AppConfig;

@Controller
public class CarController {

    @Autowired
    private ApplicationContext applicationContext;

    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model) {
        serviseCar bean = applicationContext.getBean(serviseCar.class);
        model.addAttribute("messages", bean.getListCar());
        return "cars";
    }

}
