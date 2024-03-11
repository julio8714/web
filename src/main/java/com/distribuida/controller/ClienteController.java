package com.distribuida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.dto.ClienteService;
import com.distribuida.entities.Cliente;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	//get select findAll
	
	@GetMapping("/findAll")
	public String findAll(Model model) {
		List<Cliente> clientes = clienteService.findAll();
		
		model.addAttribute("clientes", clientes);
		
		return "clientes";
		
	}
	
	//get selectfindOne
	//get selectfindOne
	@GetMapping("/findOne")
	public String findOne(@RequestParam("idCliente") @Nullable Integer idCliente, @RequestParam("opcion") @Nullable Integer opcion, Model model) {
		
		if(idCliente != null ) {
			Cliente cliente = clienteService.findOne(idCliente);
			model.addAttribute("cliente", cliente);
		}
		
		if(opcion == 1) return "clientes-add";
		else return "clientes-del";
		
	}
		
	
	//POST - insert -add()
	
	@PostMapping("/add")
	 public String add(@RequestParam("idCliente")@Nullable Integer idCliente
			 ,@RequestParam("cedula")@Nullable String cedula
			 ,@RequestParam("nombre")@Nullable String nombre
			 ,@RequestParam("apellido")@Nullable String apellido
			 ,@RequestParam("direcion")@Nullable String direcion
			 ,@RequestParam("telefono")@Nullable String telefono
			 ,@RequestParam("correo")@Nullable String correo
			 ,Model model
			 ){
			if(idCliente == null ) clienteService.add(0, cedula, nombre, apellido, direcion, telefono, correo);
			
			else clienteService.up(idCliente, cedula, nombre, apellido, direcion, telefono, correo);
		
		return "redirect:/clientes/findAll";
	}
	
	// PUT  - UPDATE - UP
	@PutMapping("/up")
	 public String up() {
		return "redirect:/clientes/findAll";
	}
	
	// DELE - DELETE  -del 
	
	@GetMapping("/del")
	public String del(@RequestParam("idCliente") @Nullable Integer idCliente) {
		
		clienteService.del(idCliente);
		
		return "redirect:/clientes/findAll";
		
		
		
	}
	
	
	
	
	

}
