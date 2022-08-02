package com.Tienda.service;
import com.Tienda.entity.Persona;
import java.util.List;

/**
 *
 * @author Sky
 */
/*solamente se definene los metodos como devuelve los objetos hacemos una lista */
/*el get personabyid hace que para obtener una persona dado un id por lo que le pasamos un parametro de id para que sea identicado*/
/*los ultimos dos son solamentente void dado que no devuelven nada entonces son pasados los parametros de objetos y id para identificarlos*/
public interface IPersonaService {
    public List<Persona> getAllPersona();
    public Persona getPersonaById (long id);
    public void savePersona (Persona persona);
    public void delete (long id);
    public Persona findByNombre (String nombre);
     
}
