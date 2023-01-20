package enoca.backChallenge.autoGallery.service.impl;

import enoca.backChallenge.autoGallery.domain.AutoGallery;
import enoca.backChallenge.autoGallery.repository.AutoGalleryRepository;
import enoca.backChallenge.autoGallery.service.AutoGalleryService;
import enoca.backChallenge.autoGallery.service.dto.AutoGalleryDto;
import enoca.backChallenge.autoGallery.service.mapper.AutoGalleryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutoGalleryServiceImpl implements AutoGalleryService {

    private AutoGalleryRepository autoGalleryRepository;
    private AutoGalleryMapper autoGalleryMapper;

    @Autowired
    public  AutoGalleryServiceImpl(AutoGalleryRepository autoGalleryRepository
            ,AutoGalleryMapper autoGalleryMapper){
        this.autoGalleryRepository = autoGalleryRepository;
        this.autoGalleryMapper = autoGalleryMapper;
    }

    @Override
    public List<AutoGalleryDto> getAutoGalleries() {
        List<AutoGallery> autoGalleryList = this.autoGalleryRepository.findAll();
        return this.autoGalleryMapper.toAutoGalleryDto(autoGalleryList);
    }

    @Override
    public AutoGalleryDto updateAutoGallery(AutoGalleryDto autoGalleryDto) {
        AutoGallery autoGallery = this.autoGalleryMapper.toAutoGallery(autoGalleryDto);
        return this.autoGalleryMapper.toAutoGalleryDto(this.autoGalleryRepository.save(autoGallery));
    }

    @Override
    public AutoGalleryDto insertAutoGallery(AutoGalleryDto autoGalleryDto) {
        AutoGallery autoGallery = this.autoGalleryMapper.toAutoGallery(autoGalleryDto);
        return this.autoGalleryMapper.toAutoGalleryDto(this.autoGalleryRepository.save(autoGallery));
    }

    @Override
    public AutoGalleryDto getAutoGalleryDto(Long id) {
        Optional<AutoGallery> autoGallery = this.autoGalleryRepository.findById(id);

        return this.autoGalleryMapper.toAutoGalleryDto(autoGallery.get());
    }

    @Override
    public AutoGallery getAutoGallery(Long id) {
        Optional<AutoGallery> autoGallery = this.autoGalleryRepository.findById(id);

        return autoGallery.get();
    }

    @Override
    public void removeAutoGallery(Long id){
        this.autoGalleryRepository.deleteById(id);
    }
}
