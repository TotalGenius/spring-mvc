package web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.carlist.CarList;
import web.model.Car;
import web.service.CarService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarList carList;

    public List<Car> getCar(Integer count){
        return carList.getCarList().stream()
                .limit(count).collect(Collectors.toList());
    }
}
