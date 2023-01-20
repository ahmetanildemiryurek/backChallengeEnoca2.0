package enoca.backChallenge.autoGallery.service.mapper;

import enoca.backChallenge.autoGallery.domain.AutoGallery;
import enoca.backChallenge.autoGallery.service.dto.AutoGalleryDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AutoGalleryMapper {

    AutoGalleryMapper  INSTANCE = Mappers.getMapper(AutoGalleryMapper.class);

    AutoGalleryDto toAutoGalleryDto(AutoGallery autoGallery);

    List<AutoGalleryDto> toAutoGalleryDto(List<AutoGallery> autoGallery);

    AutoGallery toAutoGallery(AutoGalleryDto autoGalleryDto);
}
