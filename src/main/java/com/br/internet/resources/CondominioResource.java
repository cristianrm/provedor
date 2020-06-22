package com.br.internet.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.br.internet.entites.Condominio;
import com.br.internet.services.CondominioService;

@RestController
@RequestMapping(value = "/condominios")
public class CondominioResource {

	@Autowired
	private CondominioService condominioService;

	@GetMapping
	public ResponseEntity<List<Condominio>> findAll() {

		List<Condominio> list = condominioService.findAll();

		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Condominio> findById(@PathVariable Long id) {
		Condominio obj = condominioService.findById(id);
		return ResponseEntity.ok().body(obj);

	}

	@PostMapping
	public ResponseEntity<Condominio> insert(@RequestBody Condominio obj) {

		obj = condominioService.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdCondominio())
				.toUri();
		return ResponseEntity.created(uri).body(obj);

	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		condominioService.delete(id);
		return ResponseEntity.noContent().build();// 204

	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<Condominio> update(@PathVariable Long id, @RequestBody Condominio obj) {

		obj = condominioService.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}

}
