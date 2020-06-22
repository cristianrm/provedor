package com.br.internet.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
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
	
	public Clientes insert(Clientes obj) {
		return clienteRepository.save(obj);
	}
	
	public void delete(Long id) {
		
		try {
			clienteRepository.deleteById(id);
		}catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}
		
	}
	
	public Clientes update (Long id, Clientes obj ) {
		try {
			Clientes entity = clienteRepository.getOne(id);
			updateData(entity, obj);
			return clienteRepository.save(entity);
		}catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
		
	}

	private void updateData(Clientes entity, Clientes obj) {
	  entity.setNome(obj.getNome());
	  entity.setEndereco(obj.getEndereco());
	  entity.setBairro(obj.getBairro());
		
	}

}
