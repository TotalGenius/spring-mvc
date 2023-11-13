package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.carlist.CarList;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    @Autowired
    private CarList carList;

    public List<Car> getCar(Integer count) {
        return carList.getCarList().stream()
                .limit(count).collect(Collectors.toList());
    }
}
