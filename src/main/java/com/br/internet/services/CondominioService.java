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

}
