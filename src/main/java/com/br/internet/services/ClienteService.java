package com.br.internet.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.internet.entites.Clientes;
import com.br.internet.repository.ClienteRepository;

@Service
public class ClienteService {
	

	@Autowired
	private ClienteRepository clienteRepository;
	
	
	public List<Clientes> findAll(){
		return clienteRepository.findAll();
		
	}
	
	public Clientes findById(Long id) {
		Optional<Clientes> obj = clienteRepository.findById(id);
		return obj.get();
		
	}

}
