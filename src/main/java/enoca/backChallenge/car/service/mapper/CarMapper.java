package enoca.backChallenge.car.service.mapper;

import enoca.backChallenge.car.domain.Car;
import enoca.backChallenge.car.service.dto.CarDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper {

    CarMapper  INSTANCE = Mappers.getMapper(CarMapper.class);

    CarDto toCarDTO(Car car);

    List<CarDto> toCarDTO(List<Car> car);

    Car toCar(CarDto carDto);
}
