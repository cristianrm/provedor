package com.br.internet.entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Provedor implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProvedor;
	private String provedor;
	private String endereco; 
	private String cidade;
	private String estado;
	private String cnpj;
	private String cpf;
	private String telefone;
	private String celular;
	private String email;
	private String responsavel;
	private String site;
	
	@OneToMany(mappedBy = "provedor")
	private List<Clientes> clientes = new ArrayList<>();
	
	public Provedor() {
		
	}

	public Provedor(Long idProvedor, String provedor, String endereco, String cidade, String estado, String cnpj,
			String cpf, String telefone, String celular, String email, String responsavel, String site) {
		super();
		this.idProvedor = idProvedor;
		this.provedor = provedor;
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.cnpj = cnpj;
		this.cpf = cpf;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.responsavel = responsavel;
		this.site = site;
	}

	public Long getIdProvedor() {
		return idProvedor;
	}

	public void setIdProvedor(Long idProvedor) {
		this.idProvedor = idProvedor;
	}

	public String getProvedor() {
		return provedor;
	}

	public void setProvedor(String provedor) {
		this.provedor = provedor;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}
	
	public List<Clientes> getClientes() {
		return clientes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idProvedor == null) ? 0 : idProvedor.hashCode());
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
		Provedor other = (Provedor) obj;
		if (idProvedor == null) {
			if (other.idProvedor != null)
				return false;
		} else if (!idProvedor.equals(other.idProvedor))
			return false;
		return true;
	}
	
	

}
