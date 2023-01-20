package enoca.backChallenge.car.domain;

import enoca.backChallenge.autoGallery.domain.AutoGallery;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "BRANDNAME", nullable = false , length = 30 )
     private String brandName;

    @Column(name = "MODELYEAR" , nullable = false , length = 4)
    private int modelYear;

    @Column(name = "PRİCE" , nullable = false , length = 255)
    private int price;

    @OneToMany
    @JoinColumn(name = "auto_gallery_id")
    private AutoGallery autoGallery;


}
