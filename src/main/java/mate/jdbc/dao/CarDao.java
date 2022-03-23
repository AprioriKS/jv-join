package mate.jdbc.dao;

import java.util.List;
import mate.jdbc.model.Car;

public interface CarDao {
    Car create(Car car);

    Car get(Long id);

    List<Car> getAll();

    List<Car> getAllByDriver(Long driverId);

    Car update(Car car);

    boolean delete(Long id);
}