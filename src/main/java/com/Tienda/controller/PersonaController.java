/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.controller;

import com.Tienda.entity.Pais;
import com.Tienda.entity.Persona;
import com.Tienda.service.IPaisService;
import com.Tienda.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Sky
 */
@Controller
public class PersonaController {

    @Autowired
    private IPersonaService personaService;
    
    @Autowired
    private IPaisService paisService;
    @GetMapping("/persona")
    public String index(Model model) {
        List<Persona> listaPersona = personaService.getAllPersona();
        model.addAttribute("titulo", "Tabla Persona");
        model.addAttribute("personas", listaPersona);
        return "personas";
    }
    /* Crear personas es un metodo igualitario*/
    /* Crear el service*/
    /* Cambiar todos los datos a el tipo que queremos encontrar */
     @GetMapping("/personaN")
    public String CrearPersona(Model model) {
        List<Pais> ListaPaises = paisService.listCountry();
        model.addAttribute("persona",new Persona());
        model.addAttribute("paises", ListaPaises);
        return "crear";
    }
   
      @PostMapping("/save")
    public String GuardarPersona (@ModelAttribute Persona persona ){
        personaService.savePersona(persona);
        return "redirect:/persona";
    }
    
    @GetMapping("/editPersona/{id}")
    public String editarPersona(@PathVariable("id")long idPersona,Model model){
    Persona persona=personaService.getPersonaById(idPersona);
    List<Pais> listaPaises=paisService.listCountry();
    model.addAttribute("persona",persona);
    model.addAttribute("paises",listaPaises);
    return "crear";
            }
    
    
      @GetMapping("/delete/{id}")
    public String eliminarPersona(@PathVariable("id")long idPersona){
    personaService.delete(idPersona);
    return "redirect:/persona";
    }
    
    
    
    
    
}