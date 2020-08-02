package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.Servise.serviseCar;

import java.lang.invoke.SerializedLambda;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model) {
        serviseCar serviseCar = new serviseCar();
        model.addAttribute("messages", serviseCar.getListCar());
        return "cars";
    }

}
