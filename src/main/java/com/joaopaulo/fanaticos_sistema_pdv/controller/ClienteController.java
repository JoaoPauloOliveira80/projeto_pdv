package com.joaopaulo.fanaticos_sistema_pdv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.joaopaulo.fanaticos_sistema_pdv.model.Clientes;
import com.joaopaulo.fanaticos_sistema_pdv.repository.ClienteRepository;

@RequestMapping
@Controller
public class ClienteController {
	
	@Autowired
	ClienteRepository cli_rep;
	
	
	@GetMapping("/lista")
	public List<Clientes> listarCliente(){
		 return cli_rep.findAll();
	}

}
