package Ropository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.freitas.glauber.Model.Competencia;

@Repository
public interface CompetenciaRepository extends JpaRepository<Competencia, Long>{

}
