package marvelInterface.controller;
import marvelInterface.characterDataWrapper.CharacterDataWrapper;
import marvelInterface.services.CharacterDataWrapperService;
import marvelInterface.services.ComicSummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class ApiFEController {
    @Autowired
    CharacterDataWrapperService service;
    @Autowired
    ComicSummaryService comics;

    @RequestMapping("/findOneDetails")
    public String result(Model model, @RequestParam(value = "name") String name){
        RestTemplate restTemplate=new RestTemplate();
        final String url = "https://gateway.marvel.com/v1/public/characters?&ts=1524211107&apikey=e69bc25f2fabe55e1df3cce242042f8b&hash=d80cb55a84f20ac07d4cf49b0020a6d9&name=";
        CharacterDataWrapper characterDataWrapper=restTemplate.getForObject(url+name,CharacterDataWrapper.class);
        model.addAttribute("heroDetails",characterDataWrapper.getData().getResults().get(0));
        model.addAttribute("image", characterDataWrapper.getData().getResults().get(0).getThumbnail().getPath()+".jpg");

        return "heroDetails";
    }
    @RequestMapping("/find")
    public String findHero(){
        return "findOne";
    }
    @GetMapping("/showAll")
    public String findAll(Model model){
        model.addAttribute("heros", service.findAll());
        return "showHeros";
    }
    @GetMapping("/showSpiders")
    public String findSpider(Model model){
        model.addAttribute("spiders", service.spiderHeros());
        return "spiderHeros";
    }
    @RequestMapping("/start")
    public String startPage(){
        return "start";
    }
    @GetMapping("/spiderComics")
    public String comicsSpider(Model model){
        model.addAttribute("comics", comics.comicsSpiders());
        return "comicsSpiders";
    }

    }