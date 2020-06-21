package com.br.internet.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.internet.entites.PacoteConexao;
import com.br.internet.repository.PacoteConexaoRepository;

@Service
public class PacoteConexaoService {
	

	@Autowired
	private PacoteConexaoRepository pacoteConexaoRepository;
	
	
	public List<PacoteConexao> findAll(){
		return pacoteConexaoRepository.findAll();
		
	}
	
	public PacoteConexao findById(Long id) {
		Optional<PacoteConexao> obj = pacoteConexaoRepository.findById(id);
		return obj.get();
		
	}

}
