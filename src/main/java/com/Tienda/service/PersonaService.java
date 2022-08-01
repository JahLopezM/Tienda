
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
    
    //Inyeccion dependencias para instanciar el persona repository y poder usar sus metodos escribir el autowired*/
    @Autowired
    private PersonaRepository personaRepository;
    /*devuelve o retorna los objetos de tipo persona y es casteado */
    @Override
    public List<Persona> getAllPersona(){
        return (List<Persona>)personaRepository.findAll();
    }
    /*obtenemos el metodo de sacar una persona objeto por el id */
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
} 
  