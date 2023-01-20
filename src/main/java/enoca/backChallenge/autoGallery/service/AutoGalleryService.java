package enoca.backChallenge.autoGallery.service;

import enoca.backChallenge.autoGallery.domain.AutoGallery;
import enoca.backChallenge.autoGallery.service.dto.AutoGalleryDto;

import java.util.List;

public interface AutoGalleryService {

    List<AutoGalleryDto> getAutoGalleries();

    AutoGalleryDto updateAutoGallery(AutoGalleryDto autoGalleryDto);

    AutoGalleryDto insertAutoGallery(AutoGalleryDto autoGalleryDto);

    AutoGalleryDto getAutoGalleryDto(Long id);

    AutoGallery getAutoGallery(Long id);

    void removeAutoGallery(Long id);
}
