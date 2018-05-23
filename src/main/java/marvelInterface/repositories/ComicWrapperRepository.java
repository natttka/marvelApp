package marvelInterface.repositories;

import marvelInterface.characterDataWrapper.ComicWrapper;
import org.springframework.data.repository.CrudRepository;

public interface ComicWrapperRepository extends CrudRepository<ComicWrapper, Long> {
}
