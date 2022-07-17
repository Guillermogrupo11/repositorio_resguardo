
package com.portfolio.gda.Repository;

import com.portfolio.gda.Entity.Estudios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstudiosRepository extends JpaRepository<Estudios, Long>{
    
}
