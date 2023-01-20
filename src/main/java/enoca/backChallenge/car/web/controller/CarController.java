package enoca.backChallenge.car.web.controller;

import enoca.backChallenge.car.service.CarService;
import enoca.backChallenge.car.service.dto.CarDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/car")
@RestController
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService){
        this.carService = carService;
    }

    @GetMapping("/get")
    public ResponseEntity<List<CarDto>> getCarList(){
        List<CarDto> carDTOList = this.carService.getCars();
        return  new ResponseEntity<>(carDTOList, HttpStatus.OK);
    }
    @PostMapping("/post")
    public ResponseEntity<CarDto>insertCar(CarDto carDto){
        carDto = this.carService.insertCar(carDto);
        return new ResponseEntity<>(carDto,HttpStatus.OK);
    }
    @DeleteMapping("/delete")
    public void removeCar(Long id){
        this.carService.removeCar(id);
    }

    @PutMapping("/put")
    public ResponseEntity<CarDto>updateCar(CarDto carDto){
        carDto = this.carService.updateCar(carDto);
        return new ResponseEntity<>(carDto,HttpStatus.OK);
    }


}

