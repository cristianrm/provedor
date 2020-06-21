package com.br.internet.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.internet.entites.Clientes;
import com.br.internet.services.ClienteService;


@RestController
@RequestMapping(value="/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService clienterService;
	
	@GetMapping
	public ResponseEntity<List<Clientes>> findAll() {
		
		List<Clientes> list  = clienterService.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Clientes> findById(@PathVariable Long id){
		Clientes obj = clienterService.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}

}
