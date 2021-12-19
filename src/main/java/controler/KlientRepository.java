/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface KlientRepository extends JpaRepository<Klient, Long>
{
    
    
    List<Klient> findById(int id);
    
    List<Klient> findByImieAndNazwisko(String imie, String nazwisko);
     List<Klient> findByEmail(String email);
    
    @Override
    List<Klient> findAll();

  
    
}
