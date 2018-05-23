package marvelInterface;

import marvelInterface.characterDataWrapper.*;
import marvelInterface.characterDataWrapper.CharacterType;
import marvelInterface.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;
@SpringBootApplication
public class App implements CommandLineRunner
{

    @Autowired
    CharacterRepository characterRepository;

    @Autowired
    CharacterDataWrapperRepositoty characterDataWrapperRepositoty;
    @Autowired
    CharacterDataContainerRepository characterDataContainerRepository;
    @Autowired
    ComicListRepository comicListRepository;
    @Autowired
    ComicSummarRepository comicSummarRepository;
    @Autowired
    ImageRepository imageRepository;

    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);
    }

    RestTemplate restTemplate=new RestTemplate();
    String url="http://gateway.marvel.com/v1/public/comics?ts=1&apikey=bd506182bc77875426aa883ad82207fc&hash=baccf4f054f42e74abd4c9cede7618f6";
    CharacterDataWrapper characterDataWrapper=restTemplate.getForObject(url,CharacterDataWrapper.class);
    CharacterDataContainer characterDataContainer=restTemplate.getForObject(url,CharacterDataContainer.class);

    @Override
    public void run(String... strings) throws Exception {

        comicSummarRepository.save(restTemplate.getForObject(url,ComicSummary.class));
        comicListRepository.save(restTemplate.getForObject(url,ComicList.class));
        imageRepository.save(restTemplate.getForObject(url,Image.class));
        characterRepository.save(restTemplate.getForObject(url,CharacterType.class));
        characterDataContainerRepository.save(restTemplate.getForObject(url,CharacterDataContainer.class));
        characterDataWrapperRepositoty.save(restTemplate.getForObject(url,CharacterDataWrapper.class));
    }
}
