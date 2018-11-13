package com.rest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Endereco {
	@Id
	@GeneratedValue
	private Long id;
	private String cep;
	private String rua;
	private String numero;
	private String estado;
	private String cidade;
	private String complemento;
	private String bairro;
	
	public Endereco() {}
	
	public Endereco(String cep, String rua, String numero, String estado, String cidade, String complemento,
			String bairro) {
		this.cep = cep;
		this.rua = rua;
		this.numero = numero;
		this.estado = estado;
		this.cidade = cidade;
		this.complemento = complemento;
		this.bairro = bairro;
	}
	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", rua=" + rua + ", numero=" + numero + ", estado=" + estado + ", cidade="
				+ cidade + ", complemento=" + complemento + ", bairro=" + bairro + "]";
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
}
