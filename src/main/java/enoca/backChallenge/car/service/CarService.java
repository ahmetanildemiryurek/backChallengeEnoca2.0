package enoca.backChallenge.car.service;

import enoca.backChallenge.car.domain.Car;
import enoca.backChallenge.car.service.dto.CarDto;

import java.util.List;

public interface CarService {

    List<CarDto> getCars();

    CarDto updateCar(CarDto carDTO);

    CarDto insertCar(CarDto carDTO);

    CarDto getCarDto(Long id);

    Car getCar(Long id);

    void removeCar(Long id);
}
