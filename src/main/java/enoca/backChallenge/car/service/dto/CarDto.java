package enoca.backChallenge.car.service.dto;

import enoca.backChallenge.autoGallery.domain.AutoGallery;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(force = true)
@Getter
@Setter
public class CarDto {
    private Long id;
    private String brandName;
    private int modelYear;
    private int price;
    private AutoGallery autoGallery;
}
