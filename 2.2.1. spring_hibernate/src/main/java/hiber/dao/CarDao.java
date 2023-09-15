package hiber.dao;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface CarDao {

    void add(Car car);

    List<Car> getCars();
    User getUser(String model, int series);
}
