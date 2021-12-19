package controler;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class MyController {

    @Autowired
    KlientRepository klientRepository;
    RezerwacjaRepository rezerwacjaRepository;


    
   @RequestMapping(value="/print_klient", method = RequestMethod.GET)
    public String printKlient(Model model)
    {
        List<Klient> klientList = klientRepository.findAll();
        
       model.addAttribute("header","Lista wszystkich osob"); //Dodanie obiektu do pamieci lokalnej modelu
        model.addAttribute("klientList",klientList); //Dodanie obiektu do pamieci lokalnej modelu
        
        return "printklientform";
        
    }
    
    //-------------------------------------------------------------------    
    
    //Obsluga bledow

    @ExceptionHandler
    public String handlerException(Model model,Exception exception)
    {
        String message = exception.getMessage();
        model.addAttribute("errormessage", message);
        return "errorpage";
    }
}

        