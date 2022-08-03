
package com.Tienda.service;

import com.Tienda.entity.Persona;
import com.Tienda.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sky
 */

@Service
public class PersonaService implements IPersonaService{
    
    //Inyeccion dependencias para instanciar el persona repository y poder usar sus metodos 
    @Autowired
    private PersonaRepository personaRepository;
    
    @Override
    public List<Persona> getAllPersona(){
        return (List<Persona>)personaRepository.findAll();
    }
    
    @Override
    public Persona getPersonaById (long id){
        //Si no encuentra la persona retorne nulo
        return personaRepository.findById(id).orElse(null);
    }
    
    @Override
    public void savePersona (Persona persona){
        personaRepository.save(persona);
    }
    
    @Override
    public void delete (long id){
        personaRepository.deleteById(id);
    }
     @Override
    public Persona findByNombre(String nombre){
        return personaRepository.findByNombre(nombre);
    }
}