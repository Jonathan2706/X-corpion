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
		new articulo ("Bueno", "120", "Lenovo", "2", "Toshiba"));

return articulos;
}

}
