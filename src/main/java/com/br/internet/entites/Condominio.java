package com.br.internet.entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "condominio")
public class Condominio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_condominio;
	private String nome;
	private String bairro;
	private String telefone;
	private String celular;
	private String email;

	@OneToMany(mappedBy = "condominio")
	private List<Clientes> clientes = new ArrayList<>();

	public Condominio() {

	}

	public Condominio(Long id_condominio, String nome, String bairro, String telefone, String celular, String email) {
		super();
		this.id_condominio = id_condominio;
		this.nome = nome;
		this.bairro = bairro;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
	}

	public Long getId_condominio() {
		return id_condominio;
	}

	public void setId_condominio(Long id_condominio) {
		this.id_condominio = id_condominio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Clientes> getClientes() {
		return clientes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_condominio == null) ? 0 : id_condominio.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Condominio other = (Condominio) obj;
		if (id_condominio == null) {
			if (other.id_condominio != null)
				return false;
		} else if (!id_condominio.equals(other.id_condominio))
			return false;
		return true;
	}

}
