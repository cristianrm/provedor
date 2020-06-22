package com.br.internet.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.internet.entites.Provedor;
import com.br.internet.repository.ProvedorRepository;

@Service
public class ProvedorService {

	@Autowired
	private ProvedorRepository provedorRepository;

	public List<Provedor> findAll() {
		return provedorRepository.findAll();

	}

	public Provedor findById(Long id) {
		Optional<Provedor> obj = provedorRepository.findById(id);
		return obj.get();

	}

	public Provedor insert(Provedor provedor) {
		return provedorRepository.save(provedor);
	}
	
	public void delete(Long id) {
		provedorRepository.deleteById(id);
	}
	
	public Provedor update (Long id, Provedor obj ) {
		Provedor entity = provedorRepository.getOne(id);
		updateData(entity, obj);
		return provedorRepository.save(entity);
	}

	private void updateData(Provedor entity, Provedor obj) {
	  entity.setResponsavel(obj.getResponsavel());
	  entity.setEmail(obj.getEmail());
		
	}


}
