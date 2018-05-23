package marvelInterface.services;

import marvelInterface.characterDataWrapper.ComicSummary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ComicSummaryService {
    public List<ComicSummary> comicsSpiders();
}
