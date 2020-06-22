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

import com.br.internet.entites.Parceiro;
import com.br.internet.services.ParceiroService;

@RestController
@RequestMapping(value = "/parceiros")
public class ParceiroResource {

	@Autowired
	private ParceiroService parceiroService;

	@GetMapping
	public ResponseEntity<List<Parceiro>> findAll() {

		List<Parceiro> list = parceiroService.findAll();

		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Parceiro> findById(@PathVariable Long id) {
		Parceiro obj = parceiroService.findById(id);
		return ResponseEntity.ok().body(obj);
	}

	@PostMapping
	public ResponseEntity<Parceiro> insert(@RequestBody Parceiro obj) {

		obj = parceiroService.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getidParceiro())
				.toUri();
		return ResponseEntity.created(uri).body(obj);

	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		parceiroService.delete(id);
		return ResponseEntity.noContent().build();// 204

	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<Parceiro> update(@PathVariable Long id, @RequestBody Parceiro obj) {

		obj = parceiroService.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}

}
