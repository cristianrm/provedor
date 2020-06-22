package com.br.internet.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.internet.entites.Condominio;
import com.br.internet.repository.CondominioRepository;

@Service
public class CondominioService {
	

	@Autowired
	private CondominioRepository condominioRepository;
	
	
	public List<Condominio> findAll(){
		return condominioRepository.findAll();
		
	}
	
	public Condominio findById(Long id) {
		Optional<Condominio> obj = condominioRepository.findById(id);
		return obj.get();
		
	}
	
	public Condominio insert(Condominio condominio) {
		return condominioRepository.save(condominio);
	}
	
	public void delete(Long id) {
		condominioRepository.deleteById(id);
	}
	
	public Condominio update (Long id, Condominio obj ) {
		Condominio entity = condominioRepository.getOne(id);
		updateData(entity, obj);
		return condominioRepository.save(entity);
	}

	private void updateData(Condominio entity, Condominio obj) {
	  entity.setNome(obj.getNome());
	  entity.setCelular(obj.getCelular());
	  entity.setBairro(obj.getBairro());
		
	}

}
