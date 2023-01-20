package enoca.backChallenge.autoGallery.repository;

import enoca.backChallenge.autoGallery.domain.AutoGallery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AutoGalleryRepository extends JpaRepository<AutoGallery, Long >, JpaSpecificationExecutor<AutoGallery> {
}
