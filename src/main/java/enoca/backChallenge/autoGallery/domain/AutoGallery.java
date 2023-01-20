package enoca.backChallenge.autoGallery.domain;

import enoca.backChallenge.car.domain.Car;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AutoGallery {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME" , nullable = false ,length =255 )
    private String name;

    @OneToMany
    @JoinColumn(name = "car_id")
    private Car car;

}
