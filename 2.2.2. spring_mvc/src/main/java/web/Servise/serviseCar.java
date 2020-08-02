package web.Servise;

import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

public class serviseCar {

    public List<Car> getListCar(){
        List<Car> listCar = new ArrayList<>();
        for (int i = 0; i < 5; i++)
        {
            listCar.add(new Car("car"+i, "series"+i, i));
        }
        return listCar;
    }
}
