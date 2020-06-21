package com.br.internet.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.internet.entites.Parceiro;
import com.br.internet.services.ParceiroService;


@RestController
@RequestMapping(value="/parceiros")
public class ParceiroResource {
	
	@Autowired
	private ParceiroService parceiroService;
	
	@GetMapping
	public ResponseEntity<List<Parceiro>> findAll() {
		
		List<Parceiro> list  = parceiroService.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Parceiro> findById(@PathVariable Long id){
		Parceiro obj = parceiroService.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}

}
