package com.br.internet.entites;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Parceiro implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idParceiro;
	private String paceiro;
	private String cidade;
	private String estado;
	private String cnpj;
	private String cpf;
	private String telefone;
	private String celular;
	private String email;
	private String responsavel;
	private String site;
	private Instant data_ini_parceria;
	private Instant data_fim_parceria;
	
	@OneToMany(mappedBy = "parceiro")
	private List<Clientes> clientes = new ArrayList<>();
	
	public Parceiro() {
		
	}

	public Parceiro(Long idParceiro, String paceiro, String cidade, String estado, String cnpj, String cpf,
			String telefone, String celular, String email, String responsavel, String site, Instant data_ini_parceria,
			Instant data_fim_parceria) {
		super();
		this.idParceiro = idParceiro;
		this.paceiro = paceiro;
		this.cidade = cidade;
		this.estado = estado;
		this.cnpj = cnpj;
		this.cpf = cpf;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.responsavel = responsavel;
		this.site = site;
		this.data_ini_parceria = data_ini_parceria;
		this.data_fim_parceria = data_fim_parceria;
	}

	public Long getidParceiro() {
		return idParceiro;
	}

	public void setidParceiro(Long idParceiro) {
		this.idParceiro = idParceiro;
	}

	public String getPaceiro() {
		return paceiro;
	}

	public void setPaceiro(String paceiro) {
		this.paceiro = paceiro;
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

	public Instant getData_ini_parceria() {
		return data_ini_parceria;
	}

	public void setData_ini_parceria(Instant data_ini_parceria) {
		this.data_ini_parceria = data_ini_parceria;
	}

	public Instant getData_fim_parceria() {
		return data_fim_parceria;
	}

	public void setData_fim_parceria(Instant data_fim_parceria) {
		this.data_fim_parceria = data_fim_parceria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idParceiro == null) ? 0 : idParceiro.hashCode());
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
		Parceiro other = (Parceiro) obj;
		if (idParceiro == null) {
			if (other.idParceiro != null)
				return false;
		} else if (!idParceiro.equals(other.idParceiro))
			return false;
		return true;
	}
	
	
	
	
	

}
