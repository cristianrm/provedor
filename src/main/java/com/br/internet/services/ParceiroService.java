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
	
	
	public List<Parceiro> findAll(){
		return parceiroRepository.findAll();
		
	}
	
	public Parceiro findById(Long id) {
		Optional<Parceiro> obj = parceiroRepository.findById(id);
		return obj.get();
		
	}

}
