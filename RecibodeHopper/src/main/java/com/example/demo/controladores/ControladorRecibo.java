package com.example.demo.controladores;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.example.demo.modelos.Recibo;

@Controller
public class ControladorRecibo {
	
	public static ArrayList<Recibo> lista = new ArrayList<Recibo>();
	
    @RequestMapping( value="/", method = RequestMethod.GET)
    public String index(Model model) {
        
    	if(lista.size()==0) {
 
    	model.addAttribute("name", "Grace Hopper");
    	model.addAttribute("itemName", "Alambre de cobre");
    	model.addAttribute("price", 5.25);
    	model.addAttribute("description", "Tiras de metal, otra ilustración de nanosegundos.");
    	model.addAttribute("vendor", "Tienda de la esquina Pequeñas Cosas");
    	  	
    	}
    	
        return "index.jsp";
        
    }
   
    
}
