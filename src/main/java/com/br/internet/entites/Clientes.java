package com.br.internet.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Clientes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Boolean ativo;
	private String endereco;
	private String bairro;
	private String complemento;
	private String cep;
	private String cidade;
	private String data_nascimento;
	private String sexo;
	private String telefone1;
	private String telefone2;
	private String email;
	private String dataAtivacao;
	private String rg;
	private String cpf;

	@ManyToOne
	@JoinColumn(name = "id_provedor")
	private Provedor provedor;

	@ManyToOne
	@JoinColumn(name = "id_parceiro")
	private Parceiro parceiro;

	@ManyToOne
	@JoinColumn(name = "id_condominio")
	private Condominio condominio;
	
	@ManyToOne
	@JoinColumn(name = "id_pacote_conexao")
	private PacoteConexao pacoteConexao;

	public Clientes() {

	}

	

	public Clientes(Long id, String nome, Boolean ativo, String endereco, String bairro, String complemento, String cep,
			String cidade, String data_nascimento, String sexo, String telefone1, String telefone2, String email,
			String dataAtivacao, String rg, String cpf, Provedor provedor, Parceiro parceiro, Condominio condominio,
			PacoteConexao pacoteConexao) {
		super();
		this.id = id;
		this.nome = nome;
		this.ativo = ativo;
		this.endereco = endereco;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cep = cep;
		this.cidade = cidade;
		this.data_nascimento = data_nascimento;
		this.sexo = sexo;
		this.telefone1 = telefone1;
		this.telefone2 = telefone2;
		this.email = email;
		this.dataAtivacao = dataAtivacao;
		this.rg = rg;
		this.cpf = cpf;
		this.provedor = provedor;
		this.parceiro = parceiro;
		this.condominio = condominio;
		this.pacoteConexao = pacoteConexao;
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataAtivacao() {
		return dataAtivacao;
	}

	public void setDataAtivacao(String dataAtivacao) {
		this.dataAtivacao = dataAtivacao;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

	public Provedor getProvedor() {
		return provedor;
	}



	public void setProvedor(Provedor provedor) {
		this.provedor = provedor;
	}



	public Parceiro getParceiro() {
		return parceiro;
	}



	public void setParceiro(Parceiro parceiro) {
		this.parceiro = parceiro;
	}



	public Condominio getCondominio() {
		return condominio;
	}



	public void setCondominio(Condominio condominio) {
		this.condominio = condominio;
	}



	public PacoteConexao getPacoteConexao() {
		return pacoteConexao;
	}



	public void setPacoteConexao(PacoteConexao pacoteConexao) {
		this.pacoteConexao = pacoteConexao;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Clientes other = (Clientes) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
