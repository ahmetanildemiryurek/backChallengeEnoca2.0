package enoca.backChallenge.car.service.mapper;

import enoca.backChallenge.car.domain.Car;
import enoca.backChallenge.car.service.dto.CarDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-20T15:13:48+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.4 (Eclipse Adoptium)"
)
@Component
public class CarMapperImpl implements CarMapper {

    @Override
    public CarDto toCarDTO(Car car) {
        if ( car == null ) {
            return null;
        }

        CarDto carDto = new CarDto();

        carDto.setId( car.getId() );
        carDto.setBrandName( car.getBrandName() );
        carDto.setModelYear( car.getModelYear() );
        carDto.setPrice( car.getPrice() );
        carDto.setAutoGallery( car.getAutoGallery() );

        return carDto;
    }

    @Override
    public List<CarDto> toCarDTO(List<Car> car) {
        if ( car == null ) {
            return null;
        }

        List<CarDto> list = new ArrayList<CarDto>( car.size() );
        for ( Car car1 : car ) {
            list.add( toCarDTO( car1 ) );
        }

        return list;
    }

    @Override
    public Car toCar(CarDto carDto) {
        if ( carDto == null ) {
            return null;
        }

        Car car = new Car();

        car.setId( carDto.getId() );
        car.setBrandName( carDto.getBrandName() );
        car.setModelYear( carDto.getModelYear() );
        car.setPrice( carDto.getPrice() );
        car.setAutoGallery( carDto.getAutoGallery() );

        return car;
    }
}
