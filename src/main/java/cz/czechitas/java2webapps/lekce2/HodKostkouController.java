package cz.czechitas.java2webapps.lekce2;

import org.springframework.boot.Banner;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

@Controller
public class HodKostkouController{
    private Random random = new Random();

    @GetMapping("/")
    public ModelAndView hodKostkou(){
        int hozeneCislo = random.nextInt(6)+1;
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("cislo", hozeneCislo);
        modelAndView.addObject("kostka1", hozeneCislo);
        modelAndView.addObject("kostka2", 0);

        return modelAndView;

    }

    @GetMapping("/dvanactisten")

    public ModelAndView dvanacti(){
        int hozeneCislo = random.nextInt(12)+1;
        ModelAndView modelAndView = new ModelAndView("dvanactisten");
        modelAndView.addObject("cislo", hozeneCislo);
        modelAndView.addObject("kostka1", hozeneCislo);
        modelAndView.addObject("kostka2", hozeneCislo);

        return modelAndView;

    }

}