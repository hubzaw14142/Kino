
package controler;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RezerwacjaRepository extends JpaRepository<Rezerwacja, Long> {

   @Override
   List<Rezerwacja> findAll();
}
