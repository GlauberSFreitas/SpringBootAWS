package Ropository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.freitas.glauber.Model.Experiencia;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Long>{

}
