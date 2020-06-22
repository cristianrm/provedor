package com.br.internet.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.internet.entites.Parceiro;
import com.br.internet.repository.ParceiroRepository;

@Service
public class ParceiroService {

	@Autowired
	private ParceiroRepository parceiroRepository;

	public List<Parceiro> findAll() {
		return parceiroRepository.findAll();

	}

	public Parceiro findById(Long id) {
		Optional<Parceiro> obj = parceiroRepository.findById(id);
		return obj.get();

	}

	public Parceiro insert(Parceiro parceiro) {
		return parceiroRepository.save(parceiro);
	}

	public void delete(Long id) {
		parceiroRepository.deleteById(id);
	}
	
	public Parceiro update (Long id, Parceiro obj ) {
		Parceiro entity = parceiroRepository.getOne(id);
		updateData(entity, obj);
		return parceiroRepository.save(entity);
	}

	private void updateData(Parceiro entity, Parceiro obj) {
	  entity.setResponsavel(obj.getResponsavel());
	  entity.setEmail(obj.getEmail());
		
	}

}
