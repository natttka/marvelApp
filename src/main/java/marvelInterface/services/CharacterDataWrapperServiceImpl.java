package marvelInterface.services;

import marvelInterface.characterDataWrapper.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class CharacterDataWrapperServiceImpl implements CharacterDataWrapperService {


    public CharacterDataWrapper api(String api){
        CharacterDataWrapper characterDataWrapper = new CharacterDataWrapper();
        RestTemplate restTemplate=new RestTemplate();
        String url = api;
        return  characterDataWrapper=restTemplate.getForObject(url,CharacterDataWrapper.class);
    }

    public List<CharacterType>findAll(){
        List<CharacterType> characterDataWrappers = new ArrayList<>();
        return characterDataWrappers = api("https://gateway.marvel.com:443/v1/public/characters?limit=100&ts" +
                "=1524211107&apikey=e69bc25f2fabe55e1df3cce242042f8b&hash=d80cb55a84f20ac07d4cf49b0020a6d9").getData().getResults().stream().filter(n -> !n.getDescription().isEmpty()).collect(Collectors.toList());
    }

    public List<CharacterType> spiderHeros(){
        List<CharacterType> characterDataWrappers = new ArrayList<>();
        return characterDataWrappers = api("https://gateway.marvel.com:443/v1/public/characters?nameStartsWith=s&limit=100&offset=90&ts" +
                "=1524211107&apikey=e69bc25f2fabe55e1df3cce242042f8b&hash=d80cb55a84f20ac07d4cf49b0020a6d9").getData().getResults().stream().filter(n -> n.getDescription().toLowerCase().contains("spider")).collect(Collectors.toList());
    }
}
