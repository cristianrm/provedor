package com.br.internet.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.internet.entites.Provedor;
import com.br.internet.services.ProvedorService;


@RestController
@RequestMapping(value="/provedores")
public class ProvedorResource {
	
	@Autowired
	private ProvedorService provedorService;
	
	@GetMapping
	public ResponseEntity<List<Provedor>> findAll() {
		
		List<Provedor> list  = provedorService.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Provedor> findById(@PathVariable Long id){
		Provedor obj = provedorService.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}

}
