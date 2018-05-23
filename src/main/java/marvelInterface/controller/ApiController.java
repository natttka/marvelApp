package marvelInterface.controller;
import marvelInterface.characterDataWrapper.CharacterType;
import marvelInterface.services.CharacterDataWrapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ApiController {
    @Autowired
    CharacterDataWrapperService service;

    @RequestMapping("/list")
    public List<String> findAll(){
        List<String> heros = new ArrayList<>();
        for (CharacterType character : service.spiderHeros()) {
            heros.add(character.getName());
        }
        return heros;
    }
}
