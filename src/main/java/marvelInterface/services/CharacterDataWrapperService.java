package marvelInterface.services;

import marvelInterface.characterDataWrapper.CharacterType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CharacterDataWrapperService {
    List<CharacterType> findAll();

    List<CharacterType> spiderHeros();

}