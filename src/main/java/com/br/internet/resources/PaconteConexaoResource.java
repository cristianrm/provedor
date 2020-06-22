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

import com.br.internet.entites.PacoteConexao;
import com.br.internet.services.PacoteConexaoService;

@RestController
@RequestMapping(value = "/pacotes")
public class PaconteConexaoResource {

	@Autowired
	private PacoteConexaoService pacoteConexaoService;

	@GetMapping
	public ResponseEntity<List<PacoteConexao>> findAll() {

		List<PacoteConexao> list = pacoteConexaoService.findAll();

		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<PacoteConexao> findById(@PathVariable Long id) {
		PacoteConexao obj = pacoteConexaoService.findById(id);
		return ResponseEntity.ok().body(obj);

	}

	@PostMapping
	public ResponseEntity<PacoteConexao> insert(@RequestBody PacoteConexao obj) {

		obj = pacoteConexaoService.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(obj.getIdPacoteConexao()).toUri();
		return ResponseEntity.created(uri).body(obj);

	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		pacoteConexaoService.delete(id);
		return ResponseEntity.noContent().build();// 204

	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<PacoteConexao> update(@PathVariable Long id, @RequestBody PacoteConexao obj) {

		obj = pacoteConexaoService.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}

}
