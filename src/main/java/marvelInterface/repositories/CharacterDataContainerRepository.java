package marvelInterface.repositories;

import marvelInterface.characterDataWrapper.CharacterDataContainer;
import org.springframework.data.repository.CrudRepository;

public interface CharacterDataContainerRepository extends CrudRepository<CharacterDataContainer,Long> {

}

