package marvelInterface.services;

import marvelInterface.characterDataWrapper.ComicSummary;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ComicSummaryServiceImplTest {
    ComicSummary[] comicSummaries = new ComicSummary[2];

    @Mock
    ComicSummaryServiceImpl comicSummaryService;

    @Before
    public void init(){
        TestingComics testingComics = new TestingComics();
        comicSummaries = testingComics.testComics();
//        when(comicSummaryService.comicsSpiders()).thenReturn(comicSummaries);
    }

    @Test
    public void testSpiderMethod(){
        assertEquals(1, comicSummaryService.comicsSpiders().size());
    }

}