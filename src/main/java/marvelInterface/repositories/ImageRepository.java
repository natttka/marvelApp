package marvelInterface.repositories;

import marvelInterface.characterDataWrapper.Image;
import org.springframework.data.repository.CrudRepository;

public interface ImageRepository extends CrudRepository<Image,Long> {
}
