package com.br.internet;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.br.internet.entites.Condominio;
import com.br.internet.repository.CondominioRepository;

@Configuration
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	public CondominioRepository condominioRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Condominio con1 = new Condominio(null, "asa branca", "centro", "988889889", "99999999", "cristianrm@gmail.com");
		Condominio con2 = new Condominio(null, "asa branca2", "centro", "988889889", "99999999", "cristianrm@gmail.com");
		Condominio con3 = new Condominio(null, "asa branca3", "centro", "988889889", "99999999", "cristianrm@gmail.com");
		Condominio con4 = new Condominio(null, "asa branca4", "centro", "988889889", "99999999", "cristianrm@gmail.com");
		Condominio con5 = new Condominio(null, "asa branca5", "centro", "988889889", "99999999", "cristianrm@gmail.com");
		
		
		condominioRepository.saveAll(Arrays.asList(con1,con2,con3,con4,con5));
		
		
		
		
		
	}

}
