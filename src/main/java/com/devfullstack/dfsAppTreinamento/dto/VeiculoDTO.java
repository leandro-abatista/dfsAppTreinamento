package com.devfullstack.dfsAppTreinamento.dto;

import org.springframework.beans.BeanUtils;

import com.devfullstack.dfsAppTreinamento.entities.Veiculo;

public class VeiculoDTO {

	private Long id;
	private String nomeModelo;
	private Integer anoFabricacao;
	private String marca;
	private Integer qtdDeLugares;
	private String cor;
	private String placa;
	private String renavan;
	private String motor;
	private String cambio;
	private String descricao;

	public VeiculoDTO() {

	}

	public VeiculoDTO(Veiculo entity) {
		BeanUtils.copyProperties(entity, this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeModelo() {
		return nomeModelo;
	}

	public void setNomeModelo(String nomeModelo) {
		this.nomeModelo = nomeModelo;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getQtdDeLugares() {
		return qtdDeLugares;
	}

	public void setQtdDeLugares(Integer qtdDeLugares) {
		this.qtdDeLugares = qtdDeLugares;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getRenavan() {
		return renavan;
	}

	public void setRenavan(String renavan) {
		this.renavan = renavan;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
