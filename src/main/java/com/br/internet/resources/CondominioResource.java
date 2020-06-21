package com.br.internet.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.internet.entites.Condominio;
import com.br.internet.services.CondominioService;


@RestController
@RequestMapping(value="/condominios")
public class CondominioResource {
	
	@Autowired
	private CondominioService condominioService;
	
	@GetMapping
	public ResponseEntity<List<Condominio>> findAll() {
		
		List<Condominio> list  = condominioService.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Condominio> findById(@PathVariable Long id){
		Condominio obj = condominioService.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}

}
