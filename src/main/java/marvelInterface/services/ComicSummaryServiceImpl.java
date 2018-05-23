package marvelInterface.services;

import marvelInterface.characterDataWrapper.ComicSummary;
import marvelInterface.characterDataWrapper.ComicWrapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ComicSummaryServiceImpl implements ComicSummaryService {

    public List<ComicSummary> comicsSpiders(){
        List<ComicSummary> comics = new ArrayList<>();
        ComicWrapper comicWrapper = new ComicWrapper();
        RestTemplate restTemplate=new RestTemplate();
        String url = "https://gateway.marvel.com:443/v1/public/comics?limit=100&ts=1524211107&apikey=e69bc25f2fabe55e1df3cce242042f8b&hash=d80cb55a84f20ac07d4cf49b0020a6d9";
        comicWrapper=restTemplate.getForObject(url,ComicWrapper.class);
        return comics = comicWrapper.getData().getResults().stream().filter( comic -> comic.getTitle().toLowerCase().contains("spider-man")).collect(Collectors.toList());
    }
}
