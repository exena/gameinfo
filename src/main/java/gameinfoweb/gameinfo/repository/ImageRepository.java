package gameinfoweb.gameinfo.repository;

import gameinfoweb.gameinfo.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image,Long> {
    Image findByFileName(String filename);
}
