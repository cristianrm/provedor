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

import com.br.internet.entites.Clientes;
import com.br.internet.services.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

	@Autowired
	private ClienteService clienterService;

	@GetMapping
	public ResponseEntity<List<Clientes>> findAll() {

		List<Clientes> list = clienterService.findAll();

		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Clientes> findById(@PathVariable Long id) {
		Clientes obj = clienterService.findById(id);
		return ResponseEntity.ok().body(obj);

	}

	@PostMapping
	public ResponseEntity<Clientes> insert(@RequestBody Clientes obj) {

		obj = clienterService.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);

	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		clienterService.delete(id);
		return ResponseEntity.noContent().build();// 204

	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<Clientes> update(@PathVariable Long id, @RequestBody Clientes obj) {

		obj = clienterService.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}

}
