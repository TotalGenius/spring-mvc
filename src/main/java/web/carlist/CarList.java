package web.carlist;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarList {
    private List<Car> carList;

    public CarList() {
        carList = new ArrayList<>();
        carList.add(new Car(123, "MB", "red"));
        carList.add(new Car(456, "BMW", "black"));
        carList.add(new Car(789, "LADA", "green"));
        carList.add(new Car(876, "Ferrari", "yellow"));
        carList.add(new Car(543, "Tesla", "white"));
    }

    public List<Car> getCarList() {
        return carList;
    }

}
