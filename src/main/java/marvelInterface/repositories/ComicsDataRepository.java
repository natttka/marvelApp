package marvelInterface.repositories;

import marvelInterface.characterDataWrapper.ComicsData;
import org.springframework.data.repository.CrudRepository;
public interface ComicsDataRepository extends CrudRepository<ComicsData,Long> {
}
