package controler;


import java.text.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


//Dodanie osob do repozytorium na samym poczatku
@Component
public class DataLoader implements ApplicationRunner {

   
    private final KlientRepository klientRepository;
    


    @Autowired
    public DataLoader(KlientRepository klientRepository) {

        this.klientRepository = klientRepository;
  
    }
    

    public void run(ApplicationArguments args) throws ParseException {
        

        klientRepository.save(new Klient("mati","god","nwm@nmaik","2123412"));
        

    }
}