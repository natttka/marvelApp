package marvelInterface.repositories;

import marvelInterface.characterDataWrapper.CharacterType;
import org.springframework.data.repository.CrudRepository;

public interface CharacterRepository extends CrudRepository<CharacterType, Long> {
}
