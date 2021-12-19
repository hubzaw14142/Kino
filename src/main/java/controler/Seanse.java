/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Zawisza
 */
public class Seanse {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String tytul;
    private String dataseansu;
    private String godzina;
    private int sala;
    
    
    
        protected Seanse() {}

    public Seanse(String tytul,String dataseansu, String godzina, int sala) {
        this.tytul=tytul;
        this.dataseansu = dataseansu;
        this.godzina = godzina;
        this.sala = sala;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getDataseansu() {
        return dataseansu;
    }

    public void setDataseansu(String dataseansu) {
        this.dataseansu = dataseansu;
    }

    public String getGodzina() {
        return godzina;
    }

    public void setGodzina(String godzina) {
        this.godzina = godzina;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }
    
    
     @Override
    public String toString() {
        return String.format("[%s - %s - %s - %s - %s]", id, tytul,dataseansu, godzina, sala);
    }
}
