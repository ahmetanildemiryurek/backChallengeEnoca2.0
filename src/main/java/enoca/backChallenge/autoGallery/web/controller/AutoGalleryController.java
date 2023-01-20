package enoca.backChallenge.autoGallery.web.controller;

import enoca.backChallenge.autoGallery.service.AutoGalleryService;
import enoca.backChallenge.autoGallery.service.dto.AutoGalleryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/car")
@RestController
public class AutoGalleryController {

        private final AutoGalleryService autoGalleryService;

        @Autowired
        public AutoGalleryController(AutoGalleryService autoGalleryService){
            this.autoGalleryService = autoGalleryService;
        }

        @GetMapping("/get")
        public ResponseEntity<List<AutoGalleryDto>> getAutoGalleryList(){
            List<AutoGalleryDto> autoGalleryDtoList = this.autoGalleryService.getAutoGalleries();
            return  new ResponseEntity<>(autoGalleryDtoList, HttpStatus.OK);
        }

        @PostMapping("/post")
        public ResponseEntity<AutoGalleryDto>insertAutoGallery(AutoGalleryDto autoGalleryDto){
            autoGalleryDto = this.autoGalleryService.insertAutoGallery(autoGalleryDto);
            return new ResponseEntity<>(autoGalleryDto,HttpStatus.OK);
        }

        @DeleteMapping("/delete")
        public void removeAutoGallery(Long id){
            this.autoGalleryService.removeAutoGallery(id);
        }

        @PutMapping("/put")
        public ResponseEntity<AutoGalleryDto>updateautoGallery(AutoGalleryDto autoGalleryDto){
            autoGalleryDto = this.autoGalleryService.updateAutoGallery(autoGalleryDto);
            return new ResponseEntity<>(autoGalleryDto,HttpStatus.OK);
        }
}
