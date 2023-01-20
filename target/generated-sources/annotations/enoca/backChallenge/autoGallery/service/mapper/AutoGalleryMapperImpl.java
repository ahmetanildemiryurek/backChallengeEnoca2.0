package enoca.backChallenge.autoGallery.service.mapper;

import enoca.backChallenge.autoGallery.domain.AutoGallery;
import enoca.backChallenge.autoGallery.service.dto.AutoGalleryDto;
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
public class AutoGalleryMapperImpl implements AutoGalleryMapper {

    @Override
    public AutoGalleryDto toAutoGalleryDto(AutoGallery autoGallery) {
        if ( autoGallery == null ) {
            return null;
        }

        AutoGalleryDto autoGalleryDto = new AutoGalleryDto();

        autoGalleryDto.setId( autoGallery.getId() );
        autoGalleryDto.setName( autoGallery.getName() );
        autoGalleryDto.setCar( autoGallery.getCar() );

        return autoGalleryDto;
    }

    @Override
    public List<AutoGalleryDto> toAutoGalleryDto(List<AutoGallery> autoGallery) {
        if ( autoGallery == null ) {
            return null;
        }

        List<AutoGalleryDto> list = new ArrayList<AutoGalleryDto>( autoGallery.size() );
        for ( AutoGallery autoGallery1 : autoGallery ) {
            list.add( toAutoGalleryDto( autoGallery1 ) );
        }

        return list;
    }

    @Override
    public AutoGallery toAutoGallery(AutoGalleryDto autoGalleryDto) {
        if ( autoGalleryDto == null ) {
            return null;
        }

        AutoGallery autoGallery = new AutoGallery();

        autoGallery.setId( autoGalleryDto.getId() );
        autoGallery.setName( autoGalleryDto.getName() );
        autoGallery.setCar( autoGalleryDto.getCar() );

        return autoGallery;
    }
}
