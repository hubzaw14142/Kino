package controler;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


public class Rezerwacja {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    private Klient klient;
    private Seanse seans;
    
    

    protected Rezerwacja() {}

    public Rezerwacja(Seanse seans, Klient klient) {
        this.seans=seans;
        this.klient = klient;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public Seanse getSeans() {
        return seans;
    }

    public void setSeans(Seanse seans) {
        this.seans = seans;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

     @Override
    public String toString() {
        return String.format("[%s - %s - %s]", id, seans,klient);
    }

}
