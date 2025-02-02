package hiber.service;

import hiber.model.Car;
import hiber.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CarService {
    void addCar(Car car);
    List<Car> getCars();

    public User getUser(String madel, int series);
}
