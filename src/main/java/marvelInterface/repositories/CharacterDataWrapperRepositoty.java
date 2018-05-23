package marvelInterface.repositories;

import marvelInterface.characterDataWrapper.CharacterDataWrapper;
import org.springframework.data.repository.CrudRepository;

public interface CharacterDataWrapperRepositoty extends CrudRepository<CharacterDataWrapper,Long> {
}
