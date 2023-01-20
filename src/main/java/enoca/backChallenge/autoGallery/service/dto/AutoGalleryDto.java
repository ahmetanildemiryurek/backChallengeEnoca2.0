package enoca.backChallenge.autoGallery.service.dto;

import enoca.backChallenge.car.domain.Car;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(force = true)
@Getter
@Setter
public class AutoGalleryDto {
    private Long id;
    private String name;
    private Car car;
}
