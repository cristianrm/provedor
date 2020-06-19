package com.br.internet.entites;

public class PacoteConexao {

	private String idPacoteConexao;
	private String nomePacote;
	private Double valorPacote;
	private String taxaUpload;
	private String tavaDownload;
	
	public PacoteConexao() {
		
	}

	public PacoteConexao(String idPacoteConexao, String nomePacote, Double valorPacote, String taxaUpload,
			String tavaDownload) {
		super();
		this.idPacoteConexao = idPacoteConexao;
		this.nomePacote = nomePacote;
		this.valorPacote = valorPacote;
		this.taxaUpload = taxaUpload;
		this.tavaDownload = tavaDownload;
	}

	public String getIdPacoteConexao() {
		return idPacoteConexao;
	}

	public void setIdPacoteConexao(String idPacoteConexao) {
		this.idPacoteConexao = idPacoteConexao;
	}

	public String getNomePacote() {
		return nomePacote;
	}

	public void setNomePacote(String nomePacote) {
		this.nomePacote = nomePacote;
	}

	public Double getValorPacote() {
		return valorPacote;
	}

	public void setValorPacote(Double valorPacote) {
		this.valorPacote = valorPacote;
	}

	public String getTaxaUpload() {
		return taxaUpload;
	}

	public void setTaxaUpload(String taxaUpload) {
		this.taxaUpload = taxaUpload;
	}

	public String getTavaDownload() {
		return tavaDownload;
	}

	public void setTavaDownload(String tavaDownload) {
		this.tavaDownload = tavaDownload;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idPacoteConexao == null) ? 0 : idPacoteConexao.hashCode());
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
		PacoteConexao other = (PacoteConexao) obj;
		if (idPacoteConexao == null) {
			if (other.idPacoteConexao != null)
				return false;
		} else if (!idPacoteConexao.equals(other.idPacoteConexao))
			return false;
		return true;
	}
	
	
	
}
