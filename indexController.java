package com.nfsm.springboot.web.app.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nfsm.springboot.web.app.models.articulo;

@Controller
@RequestMapping ("/app")
public class indexController {

@GetMapping({"/listar"})
public String listar(Model model) {
	
		model.addAttribute("titulo", "Articulos");
		
		return "listar";
}

@ModelAttribute("articulos")
public List<articulo>poblarUsuario(){
List<articulo> articulos = Arrays.asList(
		new articulo ("Saludable", "$5", "Danonino", "5", "Danone"),
		new articulo ("Refrescante", "$10", "Sprite", "10", "CocaCola"),
		new articulo ("Asqueroso", "$12", "Doritos", "5", "Sabritas"),
		new articulo ("Filoso", "$3", "Igloo", "18", "Mapped"),
		new articulo ("Entretenido", "$7,000", "Xbox", "1", "Microsoft"),
		new articulo ("Delicioso", "$15", "Oreo", "5", "Nestle"));


return articulos;
}

}
