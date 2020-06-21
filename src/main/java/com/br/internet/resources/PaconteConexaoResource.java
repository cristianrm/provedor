package com.br.internet.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.internet.entites.PacoteConexao;
import com.br.internet.services.PacoteConexaoService;


@RestController
@RequestMapping(value="/pacotes")
public class PaconteConexaoResource {
	
	@Autowired
	private PacoteConexaoService pacoteConexaoService;
	
	@GetMapping
	public ResponseEntity<List<PacoteConexao>> findAll() {
		
		List<PacoteConexao> list  = pacoteConexaoService.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<PacoteConexao> findById(@PathVariable Long id){
		PacoteConexao obj = pacoteConexaoService.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}

}
