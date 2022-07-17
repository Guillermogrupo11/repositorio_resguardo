
package com.portfolio.gda.Interface;

import com.portfolio.gda.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //Traer una lista de Personas
    public List<Persona> getPersona();
    
    //Guardar un Objeta de clase Persona
    public void savePersona(Persona persona);
    
    // Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por Id
    public Persona findPersona(Long id);
      
   
}
