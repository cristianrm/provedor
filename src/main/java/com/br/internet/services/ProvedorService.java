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

}
