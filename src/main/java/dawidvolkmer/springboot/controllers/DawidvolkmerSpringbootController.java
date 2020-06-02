package dawidvolkmer.springboot.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DawidvolkmerSpringbootController {

    @RequestMapping(value = {"/"})
    public String getArtists() {
        return "index";
    }

}
