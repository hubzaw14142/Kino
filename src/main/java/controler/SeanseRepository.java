/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Zawisza
 */
public interface SeanseRepository extends JpaRepository<Seanse, Long>{
     @Override
     List<Seanse> findAll();
    
}
