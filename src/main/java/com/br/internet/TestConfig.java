package com.br.internet;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.br.internet.entites.Clientes;
import com.br.internet.entites.Condominio;
import com.br.internet.repository.ClienteRepository;
import com.br.internet.repository.CondominioRepository;

@Configuration
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	public CondominioRepository condominioRepository;
	
	@Autowired
	public ClienteRepository clienteRepository;

	@Override 
	public void run(String... args) throws Exception {
		
		Condominio con1 = new Condominio(null, "asa branca", "centro", "988889889", "99999999", "cristianrm@gmail.com");
		Condominio con2 = new Condominio(null, "asa branca2", "centro", "988889889", "99999999", "cristianrm@gmail.com");
		Condominio con3 = new Condominio(null, "asa branca3", "centro", "988889889", "99999999", "cristianrm@gmail.com");
		Condominio con4 = new Condominio(null, "asa branca4", "centro", "988889889", "99999999", "cristianrm@gmail.com");
		Condominio con5 = new Condominio(null, "asa branca5", "centro", "988889889", "99999999", "cristianrm@gmail.com");
		
		condominioRepository.saveAll(Arrays.asList(con1,con2,con3,con4,con5));
		
		Clientes c1 = new Clientes(null, "Joao1", true, "Rua 4", "Cajuru", "casa 1", "889898989", "Curitiba", "27/11/1988", "M", "999999999", "9999999999", "rrroiroeiroe@gmail.coom", "11/11/2019", "333333", "1111111111112",null, null, con1,null);
		Clientes c2 = new Clientes(null, "Joao2", true, "Rua 5", "Cajuru", "casa 1", "889898989", "Curitiba", "27/11/1988", "M", "999999999", "9999999999", "rrroiroeiroe@gmail.coom", "11/11/2019", "333333", "1111111111112",null, null, con2,null);
		Clientes c3 = new Clientes(null, "Joao3", true, "Rua 6", "Cajuru", "casa 1", "889898989", "Curitiba", "27/11/1988", "M", "999999999", "9999999999", "rrroiroeiroe@gmail.coom", "11/11/2019", "333333", "1111111111112",null, null, con3,null);
				
		clienteRepository.saveAll(Arrays.asList(c1,c2,c3));
		
		
	}

}
