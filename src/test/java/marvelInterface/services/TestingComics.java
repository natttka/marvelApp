package marvelInterface.services;

import marvelInterface.characterDataWrapper.ComicSummary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TestingComics {
    public ComicSummary[] testComics(){
        ComicSummary[] comicSummaries = new ComicSummary[2];
        ComicSummary comicSummary = new ComicSummary();
        comicSummary.setTitle("spider-man");
        ComicSummary comicSummary1 = new ComicSummary();
        comicSummary1.setTitle("meduza");
        comicSummaries[0] = comicSummary;
        comicSummaries[1] = comicSummary1;
        return comicSummaries;
    }

}
