/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.util.Set;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



/**
 *
 * @author mazi
 */

public class Klient {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    private String imie;
    private String nazwisko;
    private String email;
    private String numerTelefonu;

    public Klient(Long id, String imie, String nazwisko, String email, String numerTelefonu) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.numerTelefonu = numerTelefonu;
        
    }

    
    
    
        
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumerTelefonu() {
        return numerTelefonu;
    }

    public void setNumerTelefonu(String numerTelefonu) {
        this.numerTelefonu = numerTelefonu;
    }
    
    
    protected Klient() {}
    
    
    
        @Override
    public String toString() {
        return String.format("[%s - %s - %s - %s - %s]", id, imie, nazwisko, email, numerTelefonu);
    }
    
}
