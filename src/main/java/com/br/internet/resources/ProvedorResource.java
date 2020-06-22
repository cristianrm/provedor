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

import com.br.internet.entites.Provedor;
import com.br.internet.services.ProvedorService;

@RestController
@RequestMapping(value = "/provedores")
public class ProvedorResource {

	@Autowired
	private ProvedorService provedorService;

	@GetMapping
	public ResponseEntity<List<Provedor>> findAll() {

		List<Provedor> list = provedorService.findAll();

		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Provedor> findById(@PathVariable Long id) {
		Provedor obj = provedorService.findById(id);
		return ResponseEntity.ok().body(obj);

	}

	@PostMapping
	public ResponseEntity<Provedor> insert(@RequestBody Provedor obj) {

		obj = provedorService.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdProvedor())
				.toUri();
		return ResponseEntity.created(uri).body(obj);

	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		provedorService.delete(id);
		return ResponseEntity.noContent().build();// 204

	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<Provedor> update(@PathVariable Long id, @RequestBody Provedor obj) {

		obj = provedorService.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}

}
