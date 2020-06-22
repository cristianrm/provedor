package com.br.internet.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.internet.entites.Clientes;
import com.br.internet.repository.ClienteRepository;
import com.br.internet.services.exceptions.ResourceNotFoundException;

@Service
public class ClienteService {
	

	@Autowired
	private ClienteRepository clienteRepository;
	
	
	public List<Clientes> findAll(){
		return clienteRepository.findAll();
		
	}
	
	public Clientes findById(Long id) {
		Optional<Clientes> obj = clienteRepository.findById(id);
		return obj.orElseThrow(()->new ResourceNotFoundException(id));
		
	}
	
	public Clientes insert(Clientes cliente) {
		return clienteRepository.save(cliente);
	}
	
	public void delete(Long id) {
		clienteRepository.deleteById(id);
	}
	
	public Clientes update (Long id, Clientes obj ) {
		Clientes entity = clienteRepository.getOne(id);
		updateData(entity, obj);
		return clienteRepository.save(entity);
	}

	private void updateData(Clientes entity, Clientes obj) {
	  entity.setNome(obj.getNome());
	  entity.setEndereco(obj.getEndereco());
	  entity.setBairro(obj.getBairro());
		
	}

}
